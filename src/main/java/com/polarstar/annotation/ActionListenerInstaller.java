package com.polarstar.annotation;

import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by zhangxuegang on 2016/9/30.
 */
public class ActionListenerInstaller {
    public static void processAnnotations(Object obj) {
        Class<?> cl = obj.getClass();
        for (Method m : cl.getDeclaredMethods())  //遍历方法
        {
            ActionListenerFor a = m.getAnnotation(ActionListenerFor.class);//获取Annotation
            if (a != null)  //判断是否存在
            {
                //例如，这里会是yellowButton
                Field f = null;
                try {
                    f = cl.getDeclaredField(a.source());
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                }
                f.setAccessible(true); //如果是私有，可以将私有变量，设置为可以访问.
                try {
                    addListener(f.get(obj), obj, m);
                } catch (ReflectiveOperationException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static void addListener(Object source, final Object param, final Method m)
            throws ReflectiveOperationException {
        InvocationHandler handler = new InvocationHandler() {//Annotation的Handler，这里操作没有定义，作为示例
            public Object invoke(Object proxy, Method mm, Object[] args) throws Throwable {
                return m.invoke(param);
            }
        };
        //定义ActionListener的代理类，并将代理操作委托给handler
        Object listener = Proxy.newProxyInstance(null, new Class[]{java.awt.event.ActionListener.class}, handler);
        Method adder = source.getClass().getMethod("addActionListener", ActionListener.class);
        adder.invoke(source, listener); //将ActionListener的监听器绑定到yelloButton之类的对象里，调用addActionListener完成。
    }
}

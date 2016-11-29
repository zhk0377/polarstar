package com.polarstar.pattern.aop;

import com.sun.deploy.util.Waiter;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangxuegang on 2016/5/5.
 */
public class GreetingDynamicPointcut extends DynamicMethodMatcherPointcut {
    private static List<String> specialClinetList = new ArrayList<String>();

    static {
        specialClinetList.add("John");
        specialClinetList.add("Tom");
    }

    /**
     * 对类进行动态切点检查
     *
     * @return
     */
    public ClassFilter getClassFilter() {
        return new ClassFilter() {
            @Override
            public boolean matches(Class clazz) {
                System.out.println("调用getClassFilter()对" + clazz.getName() + "做静态检查.");
                return Waiter.class.isAssignableFrom(clazz);
            }
        };
    }

    /**
     * 对方法进行静态切点检查
     *
     * @param method
     * @param clazz
     * @return
     */
    @Override
    public boolean matches(Method method, Class clazz) {
        System.out.println("调用matches(method,clazz)" + clazz.getName() + "." + method.getName() + "做静态检查");
        return "greetTo".equals(method.getName());
    }

    /**
     * 对方法进行动态切点检查
     *
     * @param method
     * @param clazz
     * @param args
     * @return
     */
    @Override
    public boolean matches(Method method, Class clazz, Object[] args) {
        System.out.println("调用matches(method,clazz)" + clazz.getName() + "." + method.getName() + "做动态检查");
        String clientName = (String) args[0];
        return specialClinetList.contains(clientName);
    }
}

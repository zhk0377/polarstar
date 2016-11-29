package com.polarstar.pattern.aop;

/**
 * Created by zhangxuegang on 2016/5/5.
 */
public class Waiter {
    public void greetTo(String name) {
        System.out.println("waiter greet to" + name + "...");
    }

    public void serveTo(String name) {
        System.out.println("waiter serving" + name + "...");
    }
}

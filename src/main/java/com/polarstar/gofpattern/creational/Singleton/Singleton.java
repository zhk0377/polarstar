package com.polarstar.gofpattern.creational.Singleton;

/**
 * Created by zhangxuegang on 2016/5/10.
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return singleton;
    }
}

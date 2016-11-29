package com.polarstar.gofpattern.creational.prototype;

/**
 * Created by zhangxuegang on 2016/5/11.
 */
public class Client {
    public static void main(String[] args) {
        Prototype obj1 = new ConcreatePrototype();
        System.out.println(obj1.cloneStr());
        Prototype obj2 = obj1.clone();
        System.out.println(obj2.cloneStr());
        if (obj1.equals(obj2)) {
            System.out.println("this is one object");
        } else {
            System.out.println("this is not one object");
        }
    }
}

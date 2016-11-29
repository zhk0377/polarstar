package com.polarstar.gofpattern.behavior.visitor;


/**
 * Created by zhangxuegang on 2016/9/29.
 */
public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("the Dog is eating now");
    }
    public void accept(Visitor v) {
        v.visit(this);
    }
}

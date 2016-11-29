package com.polarstar.gofpattern.behavior.visitor;

/**
 * Created by zhangxuegang on 2016/9/29.
 */
public class Feeder {
    public void feed(Dog d) {
        d.eat();
    }
    public void feed(Cat c) {
        c.eat();
    }
}

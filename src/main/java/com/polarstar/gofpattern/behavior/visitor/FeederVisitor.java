package com.polarstar.gofpattern.behavior.visitor;

/**
 * Created by zhangxuegang on 2016/9/29.
 */
public class FeederVisitor {
    public void visit(Cat c) {
        new Feeder().feed(c);
    }
    public void visit(Dog d) {
        new Feeder().feed(d);
    }
}

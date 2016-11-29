package com.polarstar.gofpattern.behavior.visitor;


/**
 * Created by zhangxuegang on 2016/9/29.
 */
public interface Animal {
    void eat();
    void accept(Visitor v);
}

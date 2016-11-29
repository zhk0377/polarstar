package com.polarstar.gofpattern.creational.builder;


/**
 * Created by zhangxuegang on 2016/5/11.
 * http://blog.csdn.net/theonegis/article/details/45206905
 */
public interface Builder {

    void buildPartA();

    void buildPartB();

    void buildPartC();

    Product getProduct();


}

package com.polarstar.gofpattern.behavior.strategy;

/**
 * Created by zhangxuegang on 2016/5/8.
 */
public interface DiscountStrategy {
    //定义一个用于计算打折价的方法
    double getDiscount(double originPrice);
}

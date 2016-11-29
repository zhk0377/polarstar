package com.polarstar.gofpattern.behavior.strategy;

/**
 * Created by zhangxuegang on 2016/5/8.
 */
public class OldDiscount implements DiscountStrategy {
    // 重写 getDiscount() 方法，提供旧书打折算法
    public double getDiscount(double originPrice) {
        System.out.println("使用旧书折扣 ...");
        return originPrice * 0.7;
    }
}

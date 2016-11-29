package com.polarstar.gofpattern.behavior.strategy;

/**
 * Created by zhangxuegang on 2016/5/8.
 */
public class VipDiscount implements DiscountStrategy {
    // 重写 getDiscount() 方法，提供 VIP 打折算法
    public double getDiscount(double originPrice) {
        System.out.println("使用 VIP 折扣 ...");
        return originPrice * 0.5;
    }
}

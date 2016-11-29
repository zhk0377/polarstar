package com.polarstar.gofpattern.behavior.strategy;

/**
 * Created by zhangxuegang on 2016/5/8.
 */
public class StrategyTest {
    public static void main(String[] args) {
        // 客户端没有选择打折策略类
        DiscountContext dc = new DiscountContext(null);
        double price1 = 79;
        // 使用默认的打折策略
        System.out.println("79 元的书默认打折后的价格是："
                + dc.getDiscountPrice(price1));
        // 客户端选择合适的 VIP 打折策略
        dc.changeDiscount(new VipDiscount());
        double price2 = 89;
        // 使用 VIP 打折得到打折价格
        System.out.println("89 元的书对 VIP 用户的价格是："
                + dc.getDiscountPrice(price2));
    }
}

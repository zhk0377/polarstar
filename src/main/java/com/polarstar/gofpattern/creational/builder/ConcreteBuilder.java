package com.polarstar.gofpattern.creational.builder;

/**
 * Created by zhangxuegang on 2016/5/12.
 */
public class ConcreteBuilder implements Builder {
    private Product product  = new Product();

    @Override
    public void buildPartA() {
        System.out.println("partA");
        product.setPartA("partA");
    }

    @Override
    public void buildPartB() {
        System.out.println("partB");
        product.setPartB("partB");
    }

    @Override
    public void buildPartC() {
        System.out.println("partC");
        product.setPartC("partC");
    }

    @Override
    public Product getProduct() {
        return this.product;
    }
}

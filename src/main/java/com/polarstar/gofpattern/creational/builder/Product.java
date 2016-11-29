package com.polarstar.gofpattern.creational.builder;

/**
 * Created by zhangxuegang on 2016/5/11.
 */
public class Product {
    private String partA;
    private String partB;
    private String partC;

    public Product() {

    }

    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartC() {
        return partC;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    @Override
    public String toString() {
        return "Product{" +
                "partA='" + partA + '\'' +
                ", partB='" + partB + '\'' +
                ", partC='" + partC + '\'' +
                '}';
    }

    public Product(ProductBuilder productBuilder) {
        this.partA = productBuilder.partA;
        this.partB = productBuilder.partB;
        this.partC = productBuilder.partC;
    }


    public static class ProductBuilder {
        private String partA;
        private String partB;
        private String partC;

        public ProductBuilder() {
        }

        public ProductBuilder partA(String partA) {
            this.partA = partA;
            return this;

        }
        public ProductBuilder partB(String partB) {
            this.partB = partB;
            return this;
        }

        public ProductBuilder partC(String partC) {
            this.partC = partC;
            return this;
        }

        public Product build() {
            return new Product(this);
        }

    }
}

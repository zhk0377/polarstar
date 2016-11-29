package com.polarstar.gofpattern.behavior.visitor;

/**
 * Created by zhangxuegang on 2016/9/29.
 */
public class App {

    public static void main(String[] args) {
        Feeder feeder = new Feeder();
        Animal o = new Dog();
        if (o instanceof Dog) {
            feeder.feed((Dog) o);
        } else if (o instanceof Cat) {
            feeder.feed((Cat) o);
        } else {
            throw new RuntimeException("Invalid type");
        }
    }
}

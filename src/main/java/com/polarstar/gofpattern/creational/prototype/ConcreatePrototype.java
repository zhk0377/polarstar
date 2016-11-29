package com.polarstar.gofpattern.creational.prototype;

/**
 * Created by zhangxuegang on 2016/5/11.
 */
public class ConcreatePrototype implements Prototype {
    @Override
    public Prototype clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Prototype) object;
    }

    @Override
    public String cloneStr() {
        return "always smile";
    }
}

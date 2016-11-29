package com.polarstar.common;

/**
 * Created by zhangxuegang on 2016/9/30.
 */
public class AnnotationOverrideTest {

    @Override
    public String toString() {
        return "Override the toString() of the superclass";
    }

    @SuppressWarnings(value={"unchecked","fallthrough"})
    public void generalAnnotationMethod() {
        //省略方法体
    }
}

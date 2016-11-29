package com.polarstar.gofpattern.creational.builder;


import com.google.common.base.Optional;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;

/**
 * Created by zhangxuegang on 2016/5/12.
 */
public class Client {
    public static void main(String[] args) {

//        Builder builder = new ConcreteBuilder();
//        Director director = new Director(builder);
//        director.construct();
//        Product product = builder.getProduct();
//        System.out.println(product);
//
//        // 变种的构建者模式
//        new Product.ProductBuilder()
//                .partA("张三")
//                .partB("李四")
//                .partC("王五")
//                .build();


//        Optional<Integer> possible = Optional.fromNullable(null);
//        possible.isPresent(); // returns true
//        possible.get(); // returns 5


//        if (null instanceof java.lang.Object) {
//            System.out.println("null属于java.lang.Object类型");
//        } else {
//            System.out.println("null不属于java.lang.Object类型");
//        }

//        List<Integer> list = new ArrayList<Integer>();
//        list.add(null);
//        list.add(null);
//        System.out.println(list.size());

//        Map map = new HashMap();
//        map.put(null, null);
//        map.put(null, null);

//        Optional<Integer> possible = Optional.of(6);
//        Optional<Integer> absentOpt = Optional.absent();
//        Optional<Integer> NullableOpt = Optional.fromNullable(null);
//        Optional<Integer> NoNullableOpt = Optional.fromNullable(10);
//        if (possible.isPresent()) {
//            System.out.println("possible isPresent:" + possible.isPresent());
//            System.out.println("possible value:" + possible.get());
//        }
//        if (absentOpt.isPresent()) {
//            System.out.println("absentOpt isPresent:" + absentOpt.isPresent());
//        }
//        if (NullableOpt.isPresent()) {
//            System.out.println("fromNullableOpt isPresent:" + NullableOpt.isPresent());
//        }
//        if (NoNullableOpt.isPresent()) {
//            System.out.println("NoNullableOpt isPresent:" + NoNullableOpt.isPresent());
//        }

//        Optional<Long> value = method();
//        if (value.isPresent() == true) {
//            System.out.println("获得返回值: " + value.get());
//        } else {
//            System.out.println("获得返回值: " + value.or(-12L));
//        }
//
//        System.out.println("获得返回值 orNull: " + value.orNull());
//
//        Optional<Long> valueNoNull = methodNoNull();
//        if (valueNoNull.isPresent() == true) {
//            Set<Long> set = valueNoNull.asSet();
//            System.out.println("获得返回值 set 的 size : " + set.size());
//            System.out.println("获得返回值: " + valueNoNull.get());
//        } else {
//            System.out.println("获得返回值: " + valueNoNull.or(-12L));
//        }
//        System.out.println("获得返回值 orNull: " + valueNoNull.orNull());

//        int i = -2;
//        int j = 3;
//        try {
//            Preconditions.checkArgument(i >= 0, "Argument was %s but expected nonnegative", i);
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.toString());
//        }
//        Preconditions.checkArgument(i < j, "Expected i < j, but %s > %s", i, j);


//        try {
//            Preconditions.checkNotNull(null,"参数不能为null");
//        } catch (NullPointerException e) {
//            System.out.println(e.toString());
//        }

//        Preconditions.checkState(1>2);
//
//        int index =1;
//        int size = 2;
//        Preconditions.checkElementIndex(index,size);

        Ordering.natural();

        Ordering<String> byLengthOrdering = new Ordering<String>() {
            public int compare(String left, String right) {
                return Ints.compare(left.length(), right.length());
            }
        };



    }

    private static Optional<Long> method() {
        return Optional.fromNullable(null);
    }

    private static Optional<Long> methodNoNull() {
        return Optional.fromNullable(15L);
    }


}

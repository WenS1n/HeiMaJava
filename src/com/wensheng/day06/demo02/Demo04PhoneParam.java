package com.wensheng.day06.demo02;

/**
 * @author 86504
 */
public class Demo04PhoneParam {

    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "Apple";
        one.price = 12999.99;
        one.color = "土豪金";

        method(one);
//        传递进去的卡hi就是地址值
    }

    public static void method(Phone prarm) {
        System.out.println(prarm.price);
        System.out.println(prarm.color);
        System.out.println(prarm.brand);
    }
}

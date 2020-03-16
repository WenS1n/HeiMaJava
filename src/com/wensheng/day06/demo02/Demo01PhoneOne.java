package com.wensheng.day06.demo02;

public class Demo01PhoneOne {

    public static void main(String[] args) {
//        根据Phone类，创建一个名为one的对象
//        格式：类名称.对象名 = new 类名称();
        Phone one = new Phone();
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);
        System.out.println("=======");

        one.brand = "Apple";
        one.color = "玫瑰金";
        one.price = 12899.99;
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);

        one.call("李超");
        one.sendMessage("谢博");
        one.wenchat("李佳欣");
    }
}

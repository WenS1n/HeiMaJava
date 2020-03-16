package com.wensheng.day06.demo02;

public class Demo02PhoneTwo {

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
        System.out.println("=======================");

        Phone two = new Phone();
        System.out.println(two.brand);
        System.out.println(two.color);
        System.out.println(two.price);
        System.out.println("=======");

        two.brand = "Samsung";
        two.color = "黑色";
        two.price = 11888.88;
        System.out.println(two.brand);
        System.out.println(two.color);
        System.out.println(two.price);

        two.call("三星老总");
        two.sendMessage("谢博");
        two.wenchat("李佳欣");
    }
}

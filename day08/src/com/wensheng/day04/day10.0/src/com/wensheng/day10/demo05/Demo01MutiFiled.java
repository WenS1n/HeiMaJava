package com.wensheng.day10.demo05;

/**
 * 访问成员变量的两种方法：
 *
 * 1、直接通过对象名称访问成员变量：看等号左边是谁，优先用水，没有则向上找。
 * 2、简介通过成员放啊访问成员变量：看该方法属于谁，优先用水，没有则向上找。
 * */
public class Demo01MutiFiled {

    public static void main(String[] args) {
//        使用多态的写法，父类引用指向子类对象。
        Fu obj = new Zi();
        System.out.println(obj.num);
//        System.out.println(obj.age);错误写法

        System.out.println("==============");

        //      子类没有覆盖重写，就是父类，10
        obj.showNum();
        //      子类没有覆盖重写，就是子类，20
    }

}

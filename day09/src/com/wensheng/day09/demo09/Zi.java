package com.wensheng.day09.demo09;

/**
 * super关键字用来访问父类内容，this关键字用来访问本类内容。用法也有三点：
 *
 * 1、在本类成员方法中，访问本类的成员变量。
 * 2、在本类成员方法中，访问本类的另一个成员方法。
 * 3、在本类的构造方法中，访问本类的另一个构造方法。
 * 在第三种用法当中要注意：
 * A、this(...)调用也必须是构造方法的第一个语句。唯一一个。
 * B、super和this两种构造电泳，不能同时使用。
 *
 * */
public class Zi extends Fu {

    int num = 20;

    public Zi() {
        this(123);
//        super(0);这一行不能再赠送，或者自行增写
    //        本类午餐构造，调用本类有参构造
//        this (1,2);错误写法
    }

    public Zi(int n) {
        this(1,2);
    }

    public Zi(int n,int m){
        super();
    }

    public void method() {
        int num = 10;
        System.out.println(num);
//        局部变量
        System.out.println(this.num);
//        成员变量
        System.out.println(super.num);

    }

    public void method1() {
        System.out.println("aaa");
    }

    public void method2() {
        this.method1();
        System.out.println("bbb");
    }
}

package com.wensheng.day04.demo04;

/**
 * java.util.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学相关的操作
 *
 * public static double abs(double num);获取绝对值
 * public static double ceil(double num);向上取整
 * public static double floor(double num);向下取整
 * public statoc long round(double num);四舍五入
 *
 * Math.PI代表近视的圆周率常量。(double).
 * @Descriotion
 * @author 文盛
 * @Datr 2020/03/03*/
public class Demo03Math {

    public static void main(String[] args) {
//        取绝对值
        System.out.println(Math.abs(-0.25));
        System.out.println(Math.abs(25));
        System.out.println(Math.abs(0));
        System.out.println("=============");

//        向上取整
        System.out.println(Math.ceil(4.9));
        System.out.println(Math.ceil(4.1));
        System.out.println(Math.ceil(4.0));
        System.out.println("=============");

//        向下取整
        System.out.println(Math.floor(5.0));
        System.out.println(Math.floor(5.9));
        System.out.println(Math.floor(5.1));
        System.out.println("=============");

//        四舍五入
        System.out.println(Math.round(1.0));
        System.out.println(Math.round(4.1));
        System.out.println(Math.round(4.5));

        System.out.println(Math.PI);


    }
}

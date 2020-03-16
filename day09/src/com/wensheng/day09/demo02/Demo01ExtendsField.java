package com.wensheng.day09.demo02;

/**
 * 在父类的继承关系当中，如果成员变脸重名，则创建子类对象时，访问有两种形式；
 *
 * 直接通过子类对象访问成员变量：
 *      等号左边是谁，就优先用谁，没有 则向上找
 * 简介通过成员方法访问成员变量：
 *      方法属于谁，就优先用谁，没有再向上找。
 * */
public class Demo01ExtendsField {

    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println(fu.numFu);

        Zi zi = new Zi();
        System.out.println(zi.numFu);
        System.out.println(zi.numZi);
        System.out.println("======");

        System.out.println(zi.num);
//        等号左边是谁，就优先用谁，没有 则向上找
//        System.out.println(zi.abc);儿子没得，爹也没得，有锤子都没得
        System.out.println("============");

        zi.methodZi();
//        这个方法是子类的，优先用子类的，没有再向上找
        zi.methodFu();
//        这个方法实在符类当中定义的。

    }
}

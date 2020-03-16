package com.wensheng.day10.demo01;

/**
 *
 *
 * */
public interface MyInterfacePrivateB {

    public static void methodStatic1() {
        System.out.println("静态方法一");
        methodStaticCommon();
    }

    public static void methodStatic2() {
        System.out.println("静态方法二");
        methodStaticCommon();

    }

    private static void methodStaticCommon() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
//    这里的private只能在本类当中使用。

}

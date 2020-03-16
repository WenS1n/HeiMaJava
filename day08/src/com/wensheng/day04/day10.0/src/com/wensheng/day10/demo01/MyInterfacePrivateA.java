package com.wensheng.day10.demo01;

/**
 * 问题描述：
 * 我们需要抽取一个共有方法，用来是解决两个默认方法之间重复代码的问题。
 * 但是这个公共方法不应该让实现类使用，应该是私有化的。
 *
 * 解决方案：
 * 从Java9开始，接口当中允许定义私有方法。
 * 1、普通私有方法，解决多个默认方法之间重复代码问题
 * 格式：
 * private 返回值类型 方法名称() {
 *     方法体
 * }
 *
 * 2、静态私有方法，解决多个静态方法之间重复代码问题
 * 格式：
 * private 返回值类型 方法名称() {
 *     方法体
 * }
 *
 * */
public interface MyInterfacePrivateA {

    public default void methodDefault1() {
        System.out.println("默认方法一");
       methodCommo();
    }

    public default void methodDefault2() {
        methodCommo();
    }

    private void methodCommo() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}

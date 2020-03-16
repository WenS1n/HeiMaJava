package com.wensheng.day09.demo04;

import java.util.Scanner;

/**
 * 再父子类的继承关系当中，创建子类对象，访问成员方法的规则：
 *      创建的对象是谁，就优先用谁，如果没有则向上找。
 *
 * 注意事项:
 * 无论是成员方法还是成员白能量，如果没有都是向上找父类，绝不可能向下找子类的
 *
 * 重写(Override)
 * 概念：再继承关系当中，方法的名称一样，参数列表也一样。
 *
 * 重写(override):方法的名曾一样，参数列表【也一样】。覆盖，复写
 * 重载(overload):方法的名称一样，参数列表【不一样】。
 *
 * 方法的覆盖重写难点:创建的子类对象，则有限用子类对象方法
 * */
public class Demo0ExtendsMethod {

    public static void main(String[] args) {
        Zi zi = new Zi();

        zi.methodFu();
        zi.methodZi();

        zi.method();

    }
}

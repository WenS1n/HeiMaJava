package com.wensheng.day06.demo04;

/**
 * @author 86504
 *
 *当方法的局部白能量和类的成员变量崇明的时候，根据”就近原则“，优先使用局部变量。
 * 如果需要访问本类当中的成员变量，需要使用格式：
 * this.成员变量名
 *
 * ”通过谁调用的方法，谁就是this。“
 */
public class Person {

    String name;
    //参数是对方的名字，name是自己的名字

    public void sayHello(String who) {
        System.out.println(who + "你好，我是：" + this.name);

        System.out.println(this);
    }
}

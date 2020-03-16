package com.wensheng.day06.demo03;


import java.util.Enumeration;

/**
 * @author 86504
 *
 * 局部变量和成员变量
 *
 * 1、定义的位置不一样【重点】
 * 局部变量：在方法的内部
 * 成员变量：在方法的外部，直接写在类型红
 *
 * 2、作用范围不一样【重点】
 * 局部变量：只有方法当中才可以使用，除了方法就不能再用
 * 成员变量：整个类全都可以通用。
 *
 * 3、默认值不一样【重点】
 * 局部变量：没有默认值，如果要使用，不惜手动进行赋值。
 * 成员变量：若果没有辅助，会有默认值，规则和数组一样。、
 *
 * 4、内存的位置不一样（了解）
 * 局部变量：位于栈内存
 * 成员变量：位于对每村
 *
 * 5、生命周期不一样（了解）
 * 局部变量，随着方法进栈而诞生，随着方法消失而消失。
 * 成员变量，随着对象创建而诞生，随着对象被创建而回收。
 *
 */
public class Demo01VariableDifference {
    String name;
//    成员变量
    public static void main(String[] args) {

    }

    public void method() {
        int num = 20;
//        局部变量
        System.out.println(num);
    }

    public void method1(int param) {
//        方法的参数就是局部变量，参数在方法调用的时候，必然会被赋值的。

        int age;
//        局部变量

//        System.out.println(num);
        System.out.println(name);
    }
}

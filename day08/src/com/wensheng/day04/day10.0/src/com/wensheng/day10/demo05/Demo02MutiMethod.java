package com.wensheng.day10.demo05;


/**
 * 在多台的代码当中，成员方法的访问规则是：
 *  看new的是谁，就有限用谁，没有则向上找
 *
 *  口诀：编译看左边，运行看右边。
 *
 *  对比一下：
 *  成员变量：编译看左边，运行还看左边。
 *  成员方法：编译看左边，运行看右边。
 * */
public class Demo02MutiMethod {

    public static void main(String[] args) {
        Fu obj = new Zi();
        obj.method();
//        父子都有，优先用子
        obj.methodFu();
//        子类没有父类有，想上找到父类

//        编译看左边，左边是Fu，Fu放中国没有methodZi方法，所以编译报错。
//        obj.methodZi();错误写法！
    }

}

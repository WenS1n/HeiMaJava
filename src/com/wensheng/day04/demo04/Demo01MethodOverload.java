package com.wensheng.day04.demo04;

/**
 * @author 86504
 *
 * 对于功雷士的方法来说,因为参数列表不一样,却需要记住那么多不同的方法名称,太麻烦
 *
 * 方法的重载(Overload) :多个方法的名称一样,但是参数列表却不同
 * 只需要记住唯一一个方法名称就可以实现雷士的多个功能.
 *
 * 方法重载与下列因素相关:
 * 1.参数个数不同
 * 2.参数类型不同
 * 3.参数的多类型顺序不同
 *
 * 方法重载与下列因素无关:
 * 1.与参数的名称无关,
 * 2.与方法的返回类型无关
 *
 */
public class Demo01MethodOverload {
    public static void main(String[] args) {
        /*System.out.println(sumTwo(10,20));
        System.out.println(sumThree(10,20,30));
        System.out.println(sumFour(10,20,30,40));*/
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));
    }

    public static int sum(int a ,int b){
        System.out.println("有两个参数的方法执行!");
        return a + b;
    }

    public static int sum(int a,int b,int c){
        System.out.println("有三个参数的方法执行!");
        return a + b + c;
    }

    public static int sum(int a,int b,int c,int d){
        System.out.println("有四个参数的方法执行!");
        return a + b + c + d;
    }
}

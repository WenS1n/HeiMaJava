package com.wensheng.day04.demo02;

/**
 * @author 86504
 *
 * 有参数:小括号当中有内容,当一个方法需要一些数据条件,才能完成任务的时候,就是参数的
 *       例如两个数字相加,必须知道两个数字各自是多少,才能相加的
 *
 * 无参数:小括号当中留空,一个方法不需要任何数据条件骂自己就能独立完成任务,就是无参数的
 *       例如定义一个方法,打印固定10次HelloWolrd.
 */
public class Demo03MethodParam {
    public static void main(String[] args) {
        method1(20,50);
        method2();
    }

    //两个数相乘,做乘法,必须要知道两个数到底是多少才能进行运算
    //有参数
    public static void method1(int a ,int b ){
        int result = a * b;
        System.out.println("结果是" + result);
    }

    //例如打印输出固定的文本字符串10次.
    //无参数
    public static void method2(){
        for (int i = 0; i < 10; i++) {
            System.out.println("HelloWorld" + i);
        }
    }
}

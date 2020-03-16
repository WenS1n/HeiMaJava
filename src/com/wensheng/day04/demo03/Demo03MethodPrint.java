package com.wensheng.day04.demo03;

/**
 * @author 86504
 *
 * 题目要求:
 * 定义一个方法,用来打印指定次数的HelloWorld
 */
public class Demo03MethodPrint {
    public static void main(String[] args) {
        printCount(100);
    }

    /*三要素:
     * 返回值类型:只是进行打印操作,没有计算,也没有结果,没有返回值
     * 方法名称:printCount
     * 参数列表:到底需要打印多少次,选哟告诉他,次数为 int
     * */

    public static void printCount(int num){
        for (int i = 1; i <= num; i++) {
            System.out.println("HelloWorld" + i);
        }
    }
}

package com.wensheng.day04.demo03;

/**
 * @author 86504
 *
 * 题目要求:
 * 定义一个方法:用来求出1-100之间的所有整数数字的和值.
 */
public class Demo02MethodSum {
    public static void main(String[] args) {
        System.out.println("结果是" + getSum());
    }

    /*三要素:
     * 返回值类型:int
     * 方法名称:getSame
     * 参数列表:范围固定,不需要参数
     * */

    public static int getSum(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}

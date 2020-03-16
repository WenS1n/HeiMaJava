package com.wensheng.day04.demo04;

/**
 * 题目：
 * 计算再-10.8到5.5之间，绝对值大于6或者小于2.1的整数有多少？
 *
 * 分析：
 * 1、既然确定范围，for循环
 * 2、期待你位置-10.8应该转换为-10，有两种方法
 *      2.1可以Math.ceil方法，向上(向正方向)取整
 *      2.2可以强制转换int
 * 3、每一个数字都是整数，过亿布尔表达式应该是num++；这样每次都是+1的
 * 4、如何拿到绝对值:Math.abs方法
 * 5、一旦发现了一个数字，需要让计数器++进行统计。
 *
 * 备注：如果使用Math.ceil方法，-10.8转成-10.0.double也是可以进行++的。
 *
 * */
public class Demo04MathPractise {


    public static void main(String[] args) {
        int count = 0;
        double min= -5000.7;
        double max = 1020.5;
        for (double i = Math.ceil(min); i < max; i++) {
            double abs = Math.abs(i);
            if (abs > 6 || abs < 2.1) {
                count++;
            }
        }
        System.out.println("总共有：" + count + "个数");
    }
}

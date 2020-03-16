package com.wensheng.day07.demo03;

import java.util.Random;

/**
 * @author 86504
 * <p>
 * 题目要求：
 * 根据int变量n的值，来获取随机数字，范围随机[1,n]
 * <p>
 * 思路：
 * 1、定义一个int变量，随意复制
 * 2、使用Random
 * 3、如果写10，那么就是0-9，然而得到的想要是1-10，可以发现。整体+1即可。
 * 4、打印随机数字
 */
public class Demo03Random {

    public static void main(String[] args) {
        int n = 5;
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
//            本来范围是[0,9),整体+1之后变成了[1,n+1),yejiushi [1,n];
            int result = r.nextInt(n) + 1;
            System.out.println(result);
        }

    }
}

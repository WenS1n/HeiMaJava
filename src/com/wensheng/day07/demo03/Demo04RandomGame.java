package com.wensheng.day07.demo03;

import java.util.Random;
import java.util.Scanner;

/**
 * @author 86504
 * <p>
 * 用代码模拟猜数字的小游戏。
 * <p>
 * 思路：
 * 1、首先应该秀吉产生一个数字，并且一旦产生不在变化。用到Random的nexrInt方法
 * 2、首先需要进行键盘输入，用到Scanner的nextInt方法
 * 3、已经得到两个数字，就要进行用if语句判断：
 * 如果太小，则提示太大，请重试
 * 如果太大，则提示太小，请重试
 * 2、重试就是循环，用while(true)死循环
 */

public class Demo04RandomGame {

    public static void main(String[] args) {

        System.out.println("游戏即将开始，请准备好。");
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int result = r.nextInt(100);

        for (int i = 0; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println("您还有" + (j - 1) + "次机会");


                int sum = sc.nextInt();
                System.out.println("请输入一个整数数字吧。");
                if (sum > result) {

                    System.out.println("您输入的太大了，试一下更小的数字吧。");
                } else if (sum < result) {
                    System.out.println("您输入的太小了，试一下更大的数字吧。");
                } else {
                    System.out.println("真厉害，这么快就猜对了，您可真是个小机灵鬼呢！");
                    break;
                }
            }
        }
    }
}

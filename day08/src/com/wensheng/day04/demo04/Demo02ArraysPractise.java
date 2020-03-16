package com.wensheng.day04.demo04;

import java.util.Arrays;

/**
 * 题目：
 * 请使用Arrays相关的API，将一个随机字符串升序排列，并且倒叙打印。
 * */
public class Demo02ArraysPractise {

    public static void main(String[] args) {
        String str = "drfgdfghsdafgdfdsfg3546652452v3tg45";

        /*
        * 如何进行升序排列
        * 必须是一个数组，才能用到Array.sort方法
        * String --> 数组，用toString
        * */
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
//        对字符数组进行升序排列

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}

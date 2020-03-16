package com.wensheng.day04.demo02;

import java.util.Scanner;

/**
 * 题目：
 * 键盘输入一个字符，并且统计其中字符出现的次数。
 * 总类有大写字母，小写字母，数字，其他
 *
 * 思路：
 * 1、既然用到键盘输入，就Scanner类
 * 2、键盘输入的是字符串，那么Strinf str = sc,nextInt();
 * 3、定义四个变量，分别代表四种字符各自出现的次数。
 * 4、需要对字符一个字，一个字的查，String --> char[] ,方法就是toCharArray();
 * 5、遍历char[]字符数组，对当前字符的种类进行判断，并且用四个变量进行++操作。
 * 6、打印输出四个变量，分别代表死种字符出现次数。
 *
 * */

public class Demo07StringCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串。");
        String input  = sc.next();

        int big = 0;
        int small = 0;
        int num = 0;
        int other = 0;

        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if ('A' <= ch && ch <= 'Z') {
                big++;
            } else if ('a' <= ch && ch <= 'z'){
                small++;
            }  else if ('0' <= ch && ch <= '9') {
                num++;
            } else {
                other++;
            }
        }
        System.out.println("大写字母有：" + big + "个，小写字母：" + small + "个，数字有：" + num + "个，其他的有：" + other + "个。");

    }
}

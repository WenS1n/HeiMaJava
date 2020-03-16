package com.wensheng.day04.demo02;

/**
 * 题目：
 * 定义一个方法，把数组{1,2,3}按照指定格式拼接成一个字符串。格式参照如下：[world1#world2#world3]
 *
 * 分析:
 * 1、首先准备一个int数组，内容是{1，2，3}
 * 2、定义一个方法，用来将数组变成字符串：
 * 三要数：
 * 返回值类型：String
 * 方法名称：fromArrayToString
 * 参数列表：int[]
 * 3、格式：[world1#world2#world3]
 * 用到for循环，字符串拼接，每个数组之前都有一个world字样，分割使用的是#，区分一下是不是最后一个。
 * 4、调用方法，得到返回值，并且打印结果
 *
 * */
public class Demo06StringPractise {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        String result = fromArrayToString(array);
        System.out.println(result);
    }

    public static String fromArrayToString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1){
                str += "world" + array[i] + "]";
            } else {
                str += "world" + array[i] + "#";
            }

        }return str;
    }
}

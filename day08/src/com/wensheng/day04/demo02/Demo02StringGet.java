package com.wensheng.day04.demo02;

import org.w3c.dom.ls.LSOutput;

/**
 * String当中获取相关的常用方法有:
 *
 * public int length();获取字符串当中含有的字符个数，拿到字符串的长度。
 * public String Concat(String str);将当前字符串和参数字符串拼接成为返回新的字符串。
 * public char charAt(int index);获取指定索引位置的单个字符,(索引从0开始。)
 * public int indexOf(String str);查找参数字符擦混再本字符串当中首次出现的索引位置，如果没有返回-1值
 * */
public class Demo02StringGet {

    public static void main(String[] args) {

//        获取字符串的长度
        int length = "dffdkgljdsgkfhdgjkdkfhgasdkghdfsjkghdsj".length();
        System.out.println("字符串长度为：" + length);

//        拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("=========");

//        获取指定索引位置的单个字符
        char ch = "hello".charAt(0);
        System.out.println("在一号位置的字符为：" + ch);
        System.out.println("======================");

//        查找参数字符串本来字符串当中出现的第一次索引位置
//        如果根本没有，返回值-1
        String original = "HellloWorld";
        int index = original.indexOf("Worl");
        System.out.println("第一次的索引值是：" + index);

        System.out.println("HelloWorld".indexOf("abc"));
    }
}

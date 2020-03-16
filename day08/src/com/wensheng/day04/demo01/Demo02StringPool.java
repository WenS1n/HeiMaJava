package com.wensheng.day04.demo01;

/**
 * 字符串常量池：程序当中直接写上双引号字符串，就在字符串常量池当中
 *
 * 对于基本类型来说，== 时进行数字的比较。
 * 对于引用类型来说，== 时进行【地址值】的比较。
 *
 *
 * @author 86504
 * */
public class Demo02StringPool {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str3);

    }
}

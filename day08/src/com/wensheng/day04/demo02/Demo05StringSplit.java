package com.wensheng.day04.demo02;

/**
 * 分割字符串的方法：
 * public String[] split(String regex):按照参数的规则，将字符串切分成若干部分
 *
 * 注意事项：
 * split参数实际上是一个“正则表达式”。
 * 今天要注意：如果按照英文句号”.“进行分割，必须写”\\.“（两个反斜杠）。
 * */
public class Demo05StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc,ddd";
        String[] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("=================");

        String str2 = "aaa bbb ccc ddd";
        String[] array2 = str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("=================");

        String str3 = "xxx.zzz.ccc.aaa";
        String[] array3 = str3.split("\\.");
        System.out.println(array3.length);
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }

    }
}

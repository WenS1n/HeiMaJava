package com.wensheng.day04.demo02;

/**
 * 字符串的截取方法：
 * publlic String substring(int index);截取从参数位置一直到字符串末尾，返回新的字符串。
 * public String substring(int begin,int end);截取从begin开始，一直到end结束，中间的字符串
 * 备注：
 * [begin，end)，包含左边，但是不包含右边。
 */
public class Demo03Substring {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("=============");

        String str3 = str1.substring(5, 9);
        System.out.println(str3);
        System.out.println("============");
        /*
        * 下面这种写法，字符串的内容仍然使用、hi没有改变的
        * 下面有两个字符串：“Hello”，“Java”
        * strA当中保存的值是地址值
        * 本来地址值是Hello的地址值是0x666
        * 后来地址值百年城了Java的0x999
        * */
        String strA = "Hello";

        System.out.println(strA);
        strA = "Java";
        System.out.println(strA);
    }
}

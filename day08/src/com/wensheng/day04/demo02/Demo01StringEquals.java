package com.wensheng.day04.demo02;

/**
 * ==时进行对象的地址值比较，如果确实需要字符串的比较内容，可以使用两个方法：
 *
 * public boolean euqals(objict obj);参数可以实任何对象，只有参数是一个字符串应且内容相同的才会给true，否则返回false
 * 注意事项：
 * 1、任何队先后都能使用object进行接收
 * 2、equals放啊具有对称性，也就是a.equals(b);和b.equals(a);效果一样
 * 如果比较双方一个常量，一个变量，推荐吧常量字符串卸载前面。
 * 推荐：“abc”.equals(str)     不推荐：str.euqals("abc");
 *
 * public boolean equalsIgnoreCase(String str),忽略大小写，进行内容比较。
 * */
public class Demo01StringEquals {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        char[] charArray = {'h','e','l','l','o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals("hello"));
        System.out.println("hello".equals(str1));

        String str4= "hello";
        System.out.println(str1.equals(str4));
        System.out.println("===============");

        String str5 = "abc";
        System.out.println("abc".equals(str5));
//        System.out.println(str5.equals("abc"));
//          不推荐

        System.out.println("==================");
        String strA = "java";
        String strB = "Java";
        System.out.println(strA.equals(strB));
        System.out.println(strA.equalsIgnoreCase(strB));

        System.out.println("abc一123".equalsIgnoreCase("abc壹123"));
//        只有英文才能区分大小写，其他都不区分，ASCLL码不一样
    }
}

package com.wensheng.day04.demo04;

/**
 * @author 86504
 * <p>
 * 题目要求:
 * 比较两个数据是否相等.
 * 参数类型分别为两个byte类型，两个short类型,两个int类型,两个long类型,
 * 并在main方法当中进行测试
 */
public class Demo0MethodOverloadSame {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 10;
        System.out.println(isSum(a, b));

        System.out.println(isSum((short) 10, (short) 10));

        System.out.println(isSum(10L, 10L));

        System.out.println(isSum(10, 10));
    }

    public static boolean isSum(int a, int b) {
        System.out.println("两个int参数的方法执行");
        boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }
        return same;

    }

    public static boolean isSum(long a, long b) {
        System.out.println("两个long参数的方法执行");
        boolean same = a == b ? true : false;
        return same;
    }

    public static boolean isSum(short a, short b) {
        System.out.println("两个short参数的方法执行");
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isSum(byte a, byte b) {
        System.out.println("两个byte参数的方法执行");
        return a == b;
    }
}

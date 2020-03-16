package com.wensheng.day04.demo04;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * java.util.Arrays是一个与数组相关的工具类，里面提供了大量的静态方法，用来实现数组的常见操作
 * public static String toString(数组);将参数数组变成字符串(按照默认格式：[元素1，元素2.元素3.。。])
 *
 * public static void sort(数组);按照默认升序()对数组进行排序。
 *
 * 备注：
 * 1、如果是数值，sort默认按照升序从小到大排列。
 * 2、如果是字符串，sort默认按照字母升序排序。
 * 3、如果是自定义的类型，那么这个自定义的类需要有Comparable或者Comparator接口的支持。(今后学习)
 * */
public class Demo01Arrays {

    public static void main(String[] args) {
        int[] array = {10,20,30,};
        String intStr = Arrays.toString(array);
        System.out.println(intStr);
//        [10, 20, 30]

        int[] array1 = {10,510,5,11,4564,55,1,45,};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
//        [1, 5, 10, 11, 45, 55, 510, 4564]

        String[] array2 = {"aaa","vvv","ttt","fff","ggg"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
//        [aaa, fff, ggg, ttt, vvv]


    }
}

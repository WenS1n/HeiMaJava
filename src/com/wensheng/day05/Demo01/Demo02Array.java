package com.wensheng.day05.Demo01;

/**
 * @author 86504
 *
 * 动态初始化(指定长度):在创建数组的时候,直接指定数组当中的数据元素个数.
 * 静态初始化(指定内容):在创建数组的时候,在创建数组的时候:不直接之地哦那个数组个数多少,二十直接将具体的数据进行指定.
 *
 * 静态初始化基本格式:
 * 数据类型[] 数组名称 = new 数据类型[] { 元素1, 元素2,元素3,...};
 *
 * 注意事项:
 * 虽然静态初始化没有直接告诉长度,但是根据大括号里面的元素就提内容,也可以自动推算出来长度.
 *
 *
 */
public class Demo02Array {
    public static void main(String[] args) {
        int [] arr = new int [] {1,3,5,7,9,};

        String [] arr1 = new String[] {"hello","world","java"};
    }
}

package com.wensheng.day07.demo05;

import java.util.ArrayList;

/**
 * @author 86504
 *
 * 题目：
 * 定义已经指定格式打印集合的方法(ArrayList类型作为参数)，使用{}括起来，使用@分割每一一个元素，
 * 格式参照 {元素@元素@元素}。
 * System.out.println(list);        [10.20.30]
 * printArraylist(list);        {10@20@30}
 *
 */
public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张伟");
        list.add("张博");
        list.add("张翰");
        System.out.println(list);

        printArraylist(list);
    }
    /*
    * 返回值类型：无返回值
    * 方法名称：printArraylist
    * 参数列表：ArrayList
    * */

    public static void printArraylist(ArrayList<String> list) {

//        {10@20@30}
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if(i == list.size() - 1) {
                System.out.print(name + "}");
            } else {
                System.out.print(name + "@");
            }
        }
    }
}

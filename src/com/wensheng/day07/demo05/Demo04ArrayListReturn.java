package com.wensheng.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/**
 * 题目：用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中。
 * 要求使用自定义的方法来实现筛选。
 * <p>
 * 分析：
 * 1、需要创建一个大集合：用来存储int数字，<Integer>
 * 2、随机水准就用Random nextInt
 * 3、循环20次，把随机数字放入大集合：for循环，add方法
 * 4、定义一个方法，用来进行筛选
 * 筛选：
 * 根据大集合，筛选符合要求的元素，得到小集合
 * 三要素：
 * 返回值类型：ArrayList小集合；
 * 方法名称：getsmalllist；
 * 参数列表：ArrayList大集合;
 * 5、判断（if）是偶数：num % 2 == 0;
 * 6、如果是偶数，就方法哦小集合里面，否则不放。
 */
public class Demo04ArrayListReturn {

    public static void main(String[] args) {
        ArrayList<Integer> biglist = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1;
            biglist.add(num);
        }

        ArrayList<Integer> smallList = getSmalllist(biglist);

        System.out.println("偶数总共有" + smallList.size() + "个");
        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get(i));
        }
    }

    /**
     * 这个方法接收大集合参数，返回小鸡和结果
     */
    public static ArrayList<Integer> getSmalllist(ArrayList<Integer> biglist) {
//        创建一个小集合、
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < biglist.size(); i++) {
            int num = biglist.get(i);
            if (num % 2 == 0) {
                smallList.add(num);
            }
        }
        return smallList;
    }
}

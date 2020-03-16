package com.wensheng.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author 86504
 *
 * 题目要求：
 * 生成六个1-33之间的随机整数，添加到集合，并且遍历集合
 *
 * 思路：
 * 1、需要存储6个数字，常见一个集合，<Integer>
 * 2、随机残生数字，需要Random
 * 3、用循环6次，残生6个随机数
 * 4、循环类调用r。nextInt(int n),参数是33，0-32，整体+1才是33
 * 5、吧数字添加到集合当中，add
 * 6、遍历集合for.size,get
 *
 */
public class Demo01ArrayRandom {
    public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>();
    Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33) + 1;
            list.add(num);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

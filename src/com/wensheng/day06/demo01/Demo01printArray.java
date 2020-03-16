package com.wensheng.day06.demo01;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

/**
 * @author 86504
 * 面向过程：当需要实现某一个功能的时候，每一个具体的步骤都要亲历亲为，详细处理好每一个细节。
 * 面向对象：
 */
public class Demo01printArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};
//        要求打印出格式为：[10,20,30,40,50,60]
//        使用面向过程：
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i] + "]");
            } else {
                System.out.print(array[i] + ",");
            }
        }
        System.out.println("====================");
//       使用面向对象：
//        找到一个JDK给我们提供的Array类
//        其中有一个toString方法，直接就能把数组变成想要的格式的字符串
        System.out.println(Arrays.toString(array));
    }
}

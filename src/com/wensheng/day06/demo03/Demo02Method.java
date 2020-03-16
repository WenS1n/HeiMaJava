package com.wensheng.day06.demo03;

/**
 * @author 86504
 * <p>
 * 面向对象的三大特特征：封装，继承，多态。
 * 封装性在Java当中的体现：
 * 1、方法就是一种封装
 * 2、关键字private也是一种封装
 * <p>
 * 封装即使将一些细节隐藏起来，对于外界不可见
 */
public class Demo02Method {
    public static void main(String[] args) {
        int[] array = {10, 20, 5210, 2124, 4245684, 5, 4234545, 454886, 52, 5445,};
        int max = getMax(array);
        System.out.println("最大值：" + max);
    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

}

package com.wensheng.day05.day05.Demo03;

/**
 * @author 86504
 *
 * 数组的索引编号从0开始，一直到”数组的长度-1“为止。
 *
 * 如果发耐高温数组元素的时候，索引编号并不存在，俺么将发生
 * 数组索引越界异常
 * ArrayIndexOutOfBoundsExcption
 *
 * 原因：索引标号写错了
 * 解决：修改成为存在的正确索引编号
 */
public class Demo01ArrayIndex {
    public static void main(String[] args) {
        int [] array = {12,23,34,};

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

//        错误写法，并不存在3号元素，所以发生异常
//        System.out.println(array[3]);
    }
}

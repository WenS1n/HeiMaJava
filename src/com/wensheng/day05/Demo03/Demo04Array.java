package com.wensheng.day05.Demo03;

/**
 * @author 86504
 * <p>
 * 遍历数组：说的就是对数组当中的每一个元素进行逐一处理，默认的处理方式就是打印输出。
 */
public class Demo04Array {

    public static void main(String[] args) {
        int[] array = {15,25,30,40,50,90,80,};
//        首先使用原始方式
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println(array[5]);
        System.out.println(array[6]);
        System.out.println("======");

//      使用循环,次数其实就是数组的长度。
        for (int i = 0; i < 7; i++) {
            System.out.println(array[i]);
        }
        System.out.println("==========");

//        长度
         int len = array.length;
        for (int i = 0; i < len; i++) {
            System.out.println(array[i]);
        }
        System.out.println("==========");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

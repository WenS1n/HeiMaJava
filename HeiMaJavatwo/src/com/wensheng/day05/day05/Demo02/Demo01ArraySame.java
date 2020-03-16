package com.wensheng.day05.day05.Demo02;

/**
 * @author 86504
 */
public class Demo01ArraySame {
    public static void main(String[] args) {
        int [] array = new int [3];
        System.out.println(array);
//        地址值
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("======");
        System.out.println(array);

        array[0] = 1;
        array[2] = 100;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("======");



        int [] array1 = array;
        System.out.println(array1);
//        地址值
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);
        System.out.println("======");
        System.out.println(array1);

        array1[0] = 1;
        array1[2] = 100;
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);
        System.out.println("======");
    }
}

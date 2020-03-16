package com.wensheng.day05.day05.Demo03;

/**
 * @author 86504
 *
 * 如何获取数组的长度，格式：
 * 数组名称.length
 *
 * 这将会得到一个int数字，代表数组的长度。
 *
 * 数组一旦创建，程序运行期间，长度不可改变。
 */
public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] arraya = new int [3];
        System.out.println(arraya.length);
        int[] arrayb = {1,2,52,56,23,54,5,3,45,63,445,421,45,4,12,45,121,21,45,567,856453,456,4554,45,456,4563,456,56486,};
        int len = arrayb.length;
        System.out.println("arrayb的长度为" + len);
        System.out.println("===================");

        int[] arrayc = new int[5];
        System.out.println(arrayc.length);

        int[] arrayd = new int[100];
        System.out.println(arrayd.length);
    }
}

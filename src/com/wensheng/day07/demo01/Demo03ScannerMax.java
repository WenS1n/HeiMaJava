package com.wensheng.day07.demo01;

import java.util.Scanner;

public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个int数字，求出最大值");
        System.out.println("请输入第一个数字");
        int a = sc.nextInt();
        System.out.println("请输入第一个数字");
        int b = sc.nextInt();
        System.out.println("请输入第一个数字");
        int c = sc.nextInt();
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        System.out.println("最大值为" + max);
    }
}

package com.wensheng.day07.demo01;

import java.util.Scanner;

/**
 * @author 86504
 *
 * 键入两个int数字，并且求和。
 *
 * 1、键盘输入，需要用到Scanner
 * 2、Scanner的三个步骤，导包，创建，使用
 * 3、需要的是两个数字，所有要调用两次nextInt方法
 * 4、得到两个数字就要加在一起
 * 5、将结果打印输出
 *
 */
public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输如第一个数字");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字");
        int b = sc.nextInt();

        int result = a + b;
        System.out.println("两个数字和为：" + result);
    }
}

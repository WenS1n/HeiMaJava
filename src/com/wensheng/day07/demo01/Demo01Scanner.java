package com.wensheng.day07.demo01;

import java.util.Scanner;

/**
 * @author 86504
 *
 * Scanner类的功能：可以分为实现键盘输入数据，到程序当中
 *
 * 引用类型的一般使用步骤：
 *
 * 1、导包
 * import 包路径.类名称;
 * 如果需要使用的目标类，和当前类位于同一个包下，则可以省略导包语句不写。
 * 只有java.lang包下的目录不需要导包，其他的包都需要import
 *
 * 2、创建：
 * 美名称 对象名 = new 类名称();
 *
 * 3、使用：
 * 对项目.成员方法名();
 * 获取键盘输入一个int数字，int num = sc.nextInt();
 * 获取键盘输入一个字符串：String str = sc.next();
 */
public class Demo01Scanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println("输入的数字为" + num);

        String str = sc.next();
        System.out.println("输入字符串为" + str);
    }
}

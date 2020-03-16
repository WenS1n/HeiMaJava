package com.wensheng.day07.demo02;

import java.util.Scanner;

/**
 * @author 86504
 *
 * 一步一步的分析，由一般写法，向匿名传参转入
 *
 */
public class Demo02AnonyMous {
    public static void main(String[] args) {

//        普通接收键盘输入
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();


//        使用匿名对象
//        int num = new Scanner(System.in).nextInt();
//        System.out.println(num);

//        使用一般写法传入参数
//        Scanner sc = new Scanner(System.in);
//        methodPrarm(sc);

//        使用匿名对象来进行传参
//        methodPrarm(new Scanner(System.in));

        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("输入的是" + num);
    }

    public static void methodPrarm(Scanner sc ){
        int num = sc.nextInt();
        System.out.println("输入的是" + num);
    }

    public static Scanner methodReturn() {

//        Scanner sc = new Scanner(System.in);
//        return sc;

        return new Scanner(System.in);
    }
}

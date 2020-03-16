package com.wensheng.day07.demo03;

import java.util.Random;

public class Demo02Random {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(49);
//            实际范围0-49
            System.out.print(num + " ");
        }
    }
}

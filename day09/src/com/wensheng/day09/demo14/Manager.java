package com.wensheng.day09.demo14;

import java.util.ArrayList;

/**
 * @author 86504
 * <p>
 * 群主的类
 */
public class Manager extends User {


    public Manager() {

    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
//        首先需要一个集合来存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();

//
        int leftMoney = super.getMoney();
//        群主当前余额。
        if (totalMoney > leftMoney) {
            System.out.println("余额不足。");
            return redList;
//            返回空集合
        }
//        扣钱。其实就是重新设置余额
        super.setMoney(leftMoney - totalMoney);

//        发红包，需要平均拆分成count份
        int avg = totalMoney / count;
        int mod = totalMoney % count;
//        剩下的零头放在最后一个红包当中

        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }

        int last = avg + mod;
        redList.add(last);
        return redList;
    }
}

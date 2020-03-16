package com.vesns.cn.demo08;

import com.vesns.cn.red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide( final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();

      /**随机分配，有可能多，有可能少。最少一分钱,最多不超过“剩下金额平均数的2倍”。
       * 第一次发玩红包，随即范围至少是0.01元-6.66元。
       * 第一次发完之后，剩下的至少是3.34元。
       * 此时还需要再发两个红包，此时再发范围应该是0.01-3.34元(娶不到右边，剩下0.01)
       *
       * 总结一下，范围的公式是：1 + random.nextInt(leftMoney / leftMoney * 2)
       *
       *
       */

        Random r = new Random();
//        totalMoney是总金额，分别代表剩下多少钱，剩下多少分。
        int leftMoney = totalMoney;
        int lefyCount = totalCount;

//        随机发钱n-1，最后一个和不需要随机
        for (int i = 0; i < totalCount; i++) {
            int money = r.nextInt(leftMoney / lefyCount * 2) + 1;
//            按照公式生成随机金额。
            list.add(money);
//            将一个随机红包放进集合
            leftMoney -= money;
//            剩下的金额越来越少
            lefyCount --;
//            剩下还应该子啊发的红包个数，递减
        }

//        最后一个红包不需要随机，直接放进去就行了

        list.add(leftMoney);

        return null;
    }
}

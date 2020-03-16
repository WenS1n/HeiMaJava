package com.vesns.cn.demo08;


import com.vesns.cn.red.OpenMode;

/**
 * 场景说明：
 *  红包发出去之后，所有人都有红包，大家抢完了之后，最后个红包给群主自己。
 *  大多数代码是现成的，我们需要做的就是填空/
 *  我们要做的就是：
 *      1、设置一下程序的标题，通过构造方法的字符串参数
 *      2、设置群主名称
 *      3、设置分发策略，平均，还是随机
 *
 *  红包分发的策略
 *      1、普通红包(平均)：totalMoney / totalCount，玉树放在最后一个红包当中。
 *      2、收起红包(随机)：最少一分钱，最多不超过平最熟的2倍。应该是越发越少。
 *
 *
 * @author 86504*/

public class Bootstrap {

    public static void main(String[] args) {

        MyRed red = new MyRed("思聪发红包");
//        设置群主名称
        red.setOwnerName("王思聪");

//        普通红包
//        OpenMode normal = new NormalMode();
//        red.setOpenWay(normal);

//        手气红包

        OpenMode random = new RandomMode();
        red.setOpenWay(random);

}


}
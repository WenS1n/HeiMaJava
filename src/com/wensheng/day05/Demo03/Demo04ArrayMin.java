package com.wensheng.day05.Demo03;

/**
 * @author 86504
 */
public class Demo04ArrayMin {
    public static void main(String[] args) {
        int[] array = {5, 15, 25, 20, 10000,10,-20,4235,1312};

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
//            如果当前元素，比min更小，则换人
            if (array[i] < min) {
                min = array[i];
            }
        }
//        谁最后最厉害，就能在max当中留下战斗力
        System.out.println("最小战斗力为" + min);
    }
}

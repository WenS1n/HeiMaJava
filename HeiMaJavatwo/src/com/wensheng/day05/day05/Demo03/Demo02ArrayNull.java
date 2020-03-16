package com.wensheng.day05.day05.Demo03;

/**
 * @author 86504
 *所有的引用类型变量，都可以赋值为一个null值。
 *
 * 数组必须进行new初始化才嗯那个使用其他的元素
 * 如果只赋值了一个null，没有进行new创建。
 * 空指针异常：NullPointerException
 *
 * 原因：忘了new
 * 解决：补上new
 */
public class Demo02ArrayNull {
    public static void main(String[] args) {
        int [] array = null;
//        array = new int [3];
        System.out.println(array[3]);
    }
}

package com.wensheng.day05.day05.Demo01;

/**
 * @author 86504
 *
 * 使用动态初始化数组的时候，其中的元素将会自动拥有一个默认值，规则如下：
 * 如果是证书类型，那么默认为0;
 * 如果是浮点类型，那么默认为0.0：
 * 如果是字符类型，那么默认为‘\u0000’;
 * 如果是布尔类型，那么默认为false;
 * 如果是引用类型，那么默认为null;
 *
 * 注意事项：
 * 静态初始化其实也有默认值的过程，只不过系统马上将默认值替换成了大括号当中的具体数值。
 */
public class Demo05ArrayUse {
    public static void main(String[] args) {
        //动摇初始化
        int [] array = new int [5];

        System.out.println(array);
        //内存地址值
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println("======");

//        将数字123赋值交给数组array当中的一号元素
        array[1] = 123;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }
}

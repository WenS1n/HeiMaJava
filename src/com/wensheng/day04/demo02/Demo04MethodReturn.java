package com.wensheng.day04.demo02;


/**
 * @author 86504
 *
 * 题目要求:定义一个方法,用来求出两个数字之和.(算完之后,把结果告诉我)
 * 题目变形:定义一个方法,用来打印两个数字之和.(你来计算,算完之后,你自己负责显示结果,不用告诉我结果)
 *
 * 注意事项：
 * 对于有返回值的方法，可以使用单独调用，打印调用或者赋值调用。
 * 但是对于无返回值的方法，只能使用单独调用，不能使用打印或者赋值调用。
 */
public class Demo04MethodReturn {
    public static void main(String[] args) {
        //我是main方法,我来调用你
        //我调用你,你来帮我算一下,算完之后,把结果告诉我num变量
        int num = getSum(10,20);
        System.out.println("返回值" + num);
        System.out.println("===========");

        printSum(100,200);
        System.out.println("===========");

        //正确写法
        System.out.println(getSum(100,200));
        //返回值没用用到
        getSum(100,200);

        //对于void没有返回值的方法，之恶能单独，不能打印或者赋值
//        System.out.println(printSum(100,200));//错误写法
//        System.out.println(void);

//        int num2 = printSum(10,20);
//        int num3 = void;
//        void num4 = void;
    }

    //我是一个方法,我负责两个数字相加
    //我有返回值int ,谁调用我,我就安倍计算结果告诉谁
    public static int getSum(int a ,int b ){
        int result = a * b;
        return result;
    }

    //我是一个方法，我负责两个数字相加。
    //我没有返回值，不会吧结果靠苏任何人，而是我自己进行打印输出
    public static void printSum(int a , int b){
        int result = a + b;
        System.out.println("结果是" + result );
    }
}

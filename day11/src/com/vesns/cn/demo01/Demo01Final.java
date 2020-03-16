package com.vesns.cn.demo01;

import javax.swing.text.Style;

/**
 * final关键字代表最终的，不可改变的。
 *
 * 常见的四种方法：
 * 1、可以用来修饰一个类
 * 2、可以用来修饰一个放啊
 * 3、还可以用来哦修饰一个局部变量
 * 4、还可以用来修饰一个成员变量
 *
 * */
public class Demo01Final {

    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);
        num = 20;
        System.out.println(num);

        final int num2 = 200;
        /*一旦使用final用来修饰局部变量，那么这个变量就不能进行更改。
        * “一次赋值，终生不变”*/
        System.out.println(num2);

//        num2 = 250;
//        num2 = 200;

        final int num3;
        num3 = 30;
//        正确写法，只要保证只有唯一一次赋值即可。

//        对于基本类型来说，不可变说的是变量当中的数据不可改变
//        对于引用类型来说，不可变说的是变量当中的地址值不可改变

        Student student = new Student("李超");
        System.out.println(student);
        System.out.println(student.getName());
        student = new Student("李嘉欣");
        System.out.println(student);
        System.out.println(student.getName());
        System.out.println("===============");

         final Student student1 = new Student("迪丽热巴");
//        student1 = new Student("马儿扎哈");错误写法！final的引用类型变量，其中的地址值不可改变
        student1.setName("迪丽热巴巴巴巴巴巴巴");
        System.out.println(student1.getName());
    }

}

package com.wensheng.day07.demo04;

import java.util.ArrayList;

/**
 * @author 86504
 *
 * 如果希望集合ArrayList当汇总跟到饿存储基本类型数据，必须使用基本类型对应的”包装类“；
 *
 * 基本类型     包装类(引用类型)
 * byte         Byte
 * short        Short
 * int          Integer     [特殊]
 * long         Long
 * double       Double
 * float        Float
 * char         Character   [特殊]
 * boolean      Boolean
 *
 * 从JDK 1.5+开始，支持自动装箱，自动拆箱。
 * 自动装箱：基本类型自动变成了引用类型   基本类型  -->  引用类型
 * 自动拆箱：包装类型自动拆解成了基本类型      引用类型 -->  基本类型
 *
 */
public class Demo06ArrayListBasic {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(101);
        System.out.println(list2);

        int num = list2.get(1);
        System.out.println("一号元素是：" + num);
    }
}

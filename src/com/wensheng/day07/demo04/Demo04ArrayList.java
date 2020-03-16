package com.wensheng.day07.demo04;

import java.util.ArrayList;

/**
 * @author 86504
 *
 * 但是ArrayList集合的长度是可以随便变化的
 *
 * 对于ArrayList来说，有另一个<E>表示泛型
 * 泛型：也就是装在集合当中的所有元素，全都是统一的类型
 * 注意：泛型只能是引用类型，不能是基本类型。
 *
 * 注意事项：
 * 对于ArrayList集合来说，直接打印得到的不是地址值，而是内容
 * 如果内容为空，得到的是空的中括号：[]
 */
public class Demo04ArrayList {

//    创建了一个ArrayList集合，集合的名称是list，里面装的全都是String字符串类型的数据

//    备注:从JDK1.7开始以后，右侧的尖括号内不用写内容，但是<>本身还是要写的

public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    System.out.println(list);

//    向集合当中添加一些数据，需要通道add方法。
    list.add("李超");
    list.add("迪丽热巴");
    list.add("古力娜扎");
    list.add("马儿扎哈");
    list.add("真皮沙发");
    System.out.println(list);

//    System.out.println(100);
//    错误写法，因为创建的时候尖括号里面就已经指定为字符串，添加进去的元素就必须为字符串
    }
}

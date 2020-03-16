package com.wensheng.day07.demo04;

import java.util.ArrayList;

/**
 * ArrayList当中的常用方法有：
 * <p>
 * public boolean add(E e);向集合当中添加元素，参数的类型和泛型一致。
 * 备注：对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可用可不用。
 * 但是对于其他集合而言(今后学习)来说，add添加动作不一定成功。
 * public E get(int index);从集合当中获取元素，参数是索引编号返回值就是对应位置的元素
 * public E remove(int index);从集合当中删除元素，参数是索引编号返回值就是被删除的元素
 * public int size();获取集合的尺寸长度，返回值是集合中包含的元素个数。
 *
 * @author 86504
 */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        boolean success = list.add("柳岩");
        System.out.println("添加动作是否成功呢?" + success);
        list.add("AngelaBaby");
        list.add("黄晓明");
        list.add("黄晓明前女友");
        System.out.println(list);

//        从集合房中获取是get，索引值从0开始。
        String name = list.get(2);
        System.out.println("三号索引位置的是" + name);

//        从集合当中删除元素：remove 。索引值同样为0开始。
        String whoRemove = list.remove(3);
        System.out.println("被删除的人是" + whoRemove);
        System.out.println(list);

        int size = list.size();
        System.out.println("集合的长度为" + size);
    }
}

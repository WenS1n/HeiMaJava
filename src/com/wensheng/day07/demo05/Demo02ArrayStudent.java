package com.wensheng.day07.demo05;

import java.util.ArrayList;

/**
 * @author 86504
 *
 * 题目要求：
 * 自定义一个学生对象，添加到集合，并且遍历。
 *
 * 思路：
 * 1、自定义Student学生类，四个部分
 * 2、创建一个集合，用来存储学生对象，泛型<Student>
 * 3、根据类，创建四个学生对象
 * 4、将四个学生对于下添加到集合当中：add
 * 5、遍历集合for.size.get
 *
 */
public class Demo02ArrayStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student ("李超",18);
        Student two = new Student ("李嘉欣",19);
        Student three = new Student ("李嘉诚",91);
        Student four =  new Student ("李子豪",20);

        list.add(one);
        list.add(three);
        list.add(four);
        list.add(two);
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName() + "年龄" + stu.getAge());
        }
    }
}

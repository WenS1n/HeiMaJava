package com.wensheng.day06.demo05;

/**
 * @author 86504
 *
 * 一个标准的类，通常要满足下面四个组成部分：
 *
 * 1、所有的成员变量都啊要使用private关键字修饰
 * 2、为每一个成员变量编写一对儿Getter/Setter方法
 * 3、编写一个无参数的构造方法
 * 4、编写一个有参数的构造方法
 */
public class Student {

    private String name;
    private  int age;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

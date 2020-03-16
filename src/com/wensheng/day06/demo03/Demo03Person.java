package com.wensheng.day06.demo03;

public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "文盛";

//        person.age = -18;
//        直接访问private内容，语法错误。

        person.setAge(10);
        person.show();
    }
}

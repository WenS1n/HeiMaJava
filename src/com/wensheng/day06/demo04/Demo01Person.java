package com.wensheng.day06.demo04;

public class Demo01Person {
    public static void main(String[] args) {
        Person person = new Person();

//        设置我的名字
        person.name = "马化腾";
        person.sayHello("马云");

        System.out.println(person);
    }
}

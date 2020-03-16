package com.wensheng.day04.demo03;

public class Demo03StaticStudent {

    public static void main(String[] args) {

//        设置一下教室,这是静态的东西 ,这是静态的东西,应该通过类名称来进行调用.
        Student.room = "101教室";


        Student one = new Student("李超",20);
        System.out.println("one的名字:" + one.getName());
        System.out.println("one的名字:" + one.getAge());
        System.out.println("one的教室:" + Student.room);

        System.out.println("========================");
        Student two = new Student("李嘉欣",22);
        System.out.println("two的名字:" + two.getName());
        System.out.println("two的名字:" + two.getAge());
        System.out.println("two的名字:" + Student.room);
    }
}

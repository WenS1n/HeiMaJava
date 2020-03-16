package com.wensheng.day04.demo03;

public class Student {
    private int id;
    private String name;
    private int age;
    static String room;
    private static int idcounter = 0;
//    学号计数器。每当new了一个辛对象的时候，计数器++

    public Student() {
        this.id = ++idcounter;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idcounter;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

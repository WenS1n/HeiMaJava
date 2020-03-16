package com.wensheng.day09.demo13;

public class DemoMain {

    public static void main(String[] args) {
//        Animal animal = new Animal();这是错误的

//        Dog dog = new Dog();错误，这也是抽象类

        Dog2Ha ha = new Dog2Ha();
//        这是普通类，可以直接new对象。
        ha.sleep();
        ha.eat();
        System.out.println("=============");

        DogGolden golden = new DogGolden();

        golden.eat();
        golden.sleep();
    }
}

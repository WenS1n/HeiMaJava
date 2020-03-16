package com.wensheng.day10.demo06;

import java.awt.dnd.DropTargetDragEvent;

/**
 * 如何才能知道一个父类引用第项,本来是什么子类?
 *
 * 格式：
 * 对象 instanceof 类名称
 * 这将回得到一个Boolean值结果，也就是判断前面的对象能不能当作后面类型的实例。
 *
 * */
public class Demo02Instanceof {

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();

//        如果希望调用子类特有方法。
//        判断一下父类引用是animal本来是不是Dog
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
//        判断一下animal本来是不是Cat
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
        giveMeAPet(new Dog());
    }
    public static void giveMeAPet(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }

}

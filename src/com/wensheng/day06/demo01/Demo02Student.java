package com.wensheng.day06.demo01;

/**
 * @author 86504
 *
 * 通常情况下，一个类不能直接使用，需要根据类创建一个对象，才能使用。
 *
 * 1，导包:也就是指出需要使用的类，在什么位置
 * import com.wensheng.day06.demo01.Student;
 * 对于和当前类同一个包的情况，可以省略导包语句不写。
 *
 * 2，创建，格式：
 * 类名称 对象名 = new 对象类();
 * Student stu = new Student();
 *
 * 3，使用,分为两种情况：
 * 使用成员变量：对象名。成员变量名
 * 使用成员方法：对象名.成员方法名(参数)
 * （想用谁，就用 对象名.谁。）
 *
 *
 * 注意事项：
 * 如果吃恩怨变量没有进行赋值，那么将会有一个默认值，规则和数组一样。
 *
 */
public class Demo02Student {
    public static void main(String[] args) {
//        1、导包
//        我需要使用Student类，和我自己Demo02Studen位于同一个包下，所以导包语句省略不写

//        2、创建
        Student stu = new Student();

//        3、使用其中的成员变量，格式：
//        对象名.成员变量名
        System.out.println(stu.name);
        System.out.println(stu.age);

//        改变对象当中的成员变量数值内容
        stu.age = 18;
        stu.name = "李超";

        System.out.println(stu.name);
        System.out.println(stu.age);
//        4、使用对象的成员方法，格式:
//        对象名.成员方法名()
        stu.sleep();
        stu.eat();
        stu.study();
    }
}

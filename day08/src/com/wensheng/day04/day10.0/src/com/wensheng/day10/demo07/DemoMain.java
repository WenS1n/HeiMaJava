package com.wensheng.day10.demo07;

public class DemoMain {

    public static void main(String[] args) {

        Computer computer = new Computer();
//        首先创建一个笔记本电脑
        computer.powerOn();

//        准备一个鼠标，供电脑使用
//        Mouse mouse = new Mouse();
//        首先进行向上转型
        USB usbMouse = new Mouse();
//        参数是USB类型，我正好传递进去的就是USB鼠标
        computer.useDevice(usbMouse);

//        床架按一个USB键盘
        Keyboard keyboard = new Keyboard();
//        没有用多态写法，方法参数是USB类型，传递进去的是实现类对象。
        computer.useDevice(keyboard);
//        正确写法。发生了向上转型

//        computer.useDevice(new keyboard());

        computer.powerOff();


        System.out.println("==========================");
        method(10.0);
//        正确写法,double-->double
        method(20);
//        也是正确写法int-->double
        int a = 30;
        method(a);
//        正确写法，int-->double
    }

    public static void method(double num) {
        System.out.println(num);
    }
}

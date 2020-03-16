package com.wensheng.day09.demo07;

public class Zi extends Fu {

    public Zi() {
        super(20);
//        super();
//       再调用父类无参数构造方法。
//        super(20);再调用父类重载的构造方法
        System.out.println("子类构造方法");

        /*public void method() {
//            super();错误写法，只有子类构造方法才能调用父类构造方法；
        }*/
    }
}

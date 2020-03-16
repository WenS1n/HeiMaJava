package com.wensheng.day09.demo12;

/**
 * @author 86504
 */
public class Zi extends Fu {

    public void zi() {
//        super();
        System.out.println("子类方法执行");
    }

    @Override
    public void eat() {
        System.out.println("吃饭饭");
    }
}

package com.wensheng.day10.demo01;
/**
* 从Java8开始,接口允许定义默认方法.
 * 格式:
 * public default 返回值类型 方法名称(参数列表) {
 *     方法体
 * }
 *
 * 备注:接口当中的默认方法,可以解决接口升级的问题.
* */
public interface MyInterfaceDefault {

    public abstract void methodAbs();
//    抽象方法

//    public abstract void methodAbs2();
//    新添加的抽象方法

    public default void methodDefault() {
        System.out.println("这是一个新添加的默认方法");
    }
//    新添加的方法,改成默认方法,在此public也可以省略,但是只能用public
}

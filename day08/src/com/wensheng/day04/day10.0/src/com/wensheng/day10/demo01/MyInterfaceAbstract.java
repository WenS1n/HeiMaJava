package com.wensheng.day10.demo01;

/**
 * 在任何版本的Java中，接口都能定义抽象方法。
 * 格式：
 * public abstract 返回值类型 方法名称(参数列表);
 *
 * 注意事项：
 * 1、接口当中的抽象方法，修饰符必须是两个固定的关键字，public abstract
 * 2、这两个关键字修饰符，可以选择性的省略。(今天刚开始学习，所以不推荐)
 * 3.方法的三要素,可以随意定义.
 *
 * @author 86504*/
public interface MyInterfaceAbstract {

    public abstract void methodAbs1();
//    这是一个抽象方法

    abstract void methodAbs2();
//    这也是一个抽象方法

    public void methodAbs3();
//    这还是一个抽象方法

    void methodAbs();
//    这是最简化的抽象方法

}

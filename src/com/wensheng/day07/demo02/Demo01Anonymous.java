package com.wensheng.day07.demo02;

/**
 * @author 86504
 *
 * 创建对象的标准格式：
 * 类名称 对象名 = new 类名称();
 *
 * 匿名对象就是只有右边的对象，没有左边的名字和赋值运算符
 * new 类名称();
 *
 * 注意事项：匿名对象只能使用一次，下次使用不得不在创建一个新对象；
 * 使用建议：如果确定有一个对象只是有一次，就可以用匿名对象
 */
public class Demo01Anonymous {

    public static void main(String[] args) {
        Person one = new Person();
        one.name = "李超";
        one.showName();
        System.out.println("==============");

//        匿名对象
        new Person().name = "李嘉欣";
        new Person().showName();
    }
}

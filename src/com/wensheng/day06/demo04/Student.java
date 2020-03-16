package com.wensheng.day06.demo04;

/**
 * @author 86504
 *
 * 构造方法是专门用来创建对象的方法，当我们通过关键字new来创建对象时，其实就是在调用构造方法。
 * 格式：
 * public 类名称(参数类型 参数名称) {
 *     方法体
 * }
 *
 * 注意事项：
 * 1、构造方法的名称必须和所在类名称完全一致。
 * 2、构造方法不要写返回值类型，连void都不写.
 * 3、构造方法不能return一个具体的返回值。
 * 4、如果没有编写任何构造方法，那么编译器会默认赠送一个构造方法，没有参数，方法体什么事情都能做
 * 5、一旦编写了至少一个狗杂哦方法，那么编译器将不再赠送。
 * 6、狗杂哦方法也是可以进行重载的。
 * 重载：方法名称相同，参数列表不同
 */
public class Student {

    /*public Student() {
        System.out.println("构造方法执行了");

    }*/

//    成员变量
    private String name;
    private int age;

//    无参数构造方法
    public Student() {
        System.out.println("无参数构造方法执行了");
    }

//    全参数构造方法
    public Student(String name,int age) {
        System.out.println("有参数构造方法执行了");
        this.age = age;
        this.name = name;
    }

//    getter/setter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return  name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

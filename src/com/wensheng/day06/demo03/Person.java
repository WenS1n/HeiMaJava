package com.wensheng.day06.demo03;

/**
 * @author 86504
 *
 * 定义person年龄时，无法阻止不合理的数值被设置进来。
 * 解决方案：用private关键字将需要保护的成员变量进行修饰。
 *
 * 间接访问privat成员变量，就是定义一堆Getter/Setter方法
 *
 * 必须交setxxx或者是getxxx命名规则。
 * 对于Getter来说，不能有参数，返回值类型和成员变量对应；
 * 对于Setter来说，不能又返回值，参数类型和成员变量对应。
 */
public class Person {
    String name;
    private int age;
    public void show() {
        System.out.println("我叫" + name + "," + "我今年" + age + "岁了。");
    }

//    这个成员方法专门想age设置数据。
    public void setAge(int num) {
        if(num < 100 && num > 0) {
            age = num;
        }else {
            System.out.println("数据不合理");
        }

    }

//    这个成员方法专门获取age的数据。
    public int getAge() {
        return age;
    }
}

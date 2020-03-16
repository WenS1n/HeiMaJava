package com.vesns.cn.demo01;


/**
 * 对于成员变量来说，如果使用final故拿剪子修饰，那么这个变量也照样是不可变。
 *
 * 1、由于成员变量具有默认值所有用了final之后必须手动赋值，不会再给默认值了
 * 2、对于final的成员比那辆，药品么使用直接赋值，要么通过构造方法赋值。二选一。
 * 3、必须保证类当中所有的重在的发构造方法，都最终会对final的成员便令进行赋值
 *
 * */
public class Person {

    private final String name/* = "蔡徐坤"*/;

    public Person() {
        name = "打篮球";
    }

    public String getName() {
        return name;
    }

    /*public void setName(String name) {
        this.name = name;
    }*/

    public Person(String name) {
        this.name = name;
    }

}

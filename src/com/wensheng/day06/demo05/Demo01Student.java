package com.wensheng.day06.demo05;

public class Demo01Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setAge(20);
        stu1.setName("迪丽热巴");
        System.out.println("姓名:" + stu1.getName() + ",年龄" + stu1.getAge());
        System.out.println("===============================================");

        Student stu2 = new Student("马儿扎哈", 22);
        System.out.println("姓名:" + stu2.getName() + ",年龄" + stu2.getAge());
        System.out.println("===============================================");

        stu2.setAge(23);
        stu2.setName("古力娜扎");
        System.out.println("姓名:" + stu2.getName() + ",年龄" + stu2.getAge());
        System.out.println("===============================================");

        stu2.setAge(24);
        stu2.setName("真皮沙发");
        System.out.println("姓名:" + stu2.getName() + ",年龄" + stu2.getAge());
    }
}

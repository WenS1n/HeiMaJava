package com.wensheng.day07.demo04;

/**
 * @author 86504
 *
 * 题目：定义一个数组，用来存储三个Person对象。
 *
 * 数组有一个缺点：一旦创建，程序运行期间长度不可以改变。
 *
 */
public class Demo01Array {

    public static void main(String[] args) {
//        首先创建一个长度为3的数组，里面用来存放Person类型的对象
        Person[] arr = new Person[3];

        Person one = new Person("迪丽热巴",20);
        Person two = new Person("古力娜扎",21);
        Person three = new Person("马儿扎哈",38);

//        将one的地址值赋值到数组的0号元素位置
        arr[0] = one;
        arr[1] = two;
        arr[2] = three;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

//        Person person =
        System.out.println(arr[1].getName());

    }

}

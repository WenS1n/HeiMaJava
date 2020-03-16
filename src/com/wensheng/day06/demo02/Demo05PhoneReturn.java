package com.wensheng.day06.demo02;

public class Demo05PhoneReturn {

    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.color);
        System.out.println(two.price);
    }

    public static Phone getPhone() {
        Phone one = new Phone();
        one.color = "墨绿色";
        one.price = 18999.88;
        one.brand = "Apple";
        return one;
    }
}

package com.wensheng.day06.demo02;

public class Phone {
    String brand;
    double price;
    String color;

    public void call(String who) {
        System.out.println("给" + who + "发微信");
    }

    public void wenchat(String who) {
        System.out.println("给" + who + "发微信");
    }

    public void sendMessage(String who) {
        System.out.println( who + "群发短信");
    }
}

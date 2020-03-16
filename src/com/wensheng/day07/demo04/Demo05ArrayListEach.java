package com.wensheng.day07.demo04;

import java.util.ArrayList;

public class Demo05ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("迪丽热巴");
        list.add("马儿扎哈");
        list.add("真皮沙发");

//        遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

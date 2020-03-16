package com.wensheng.day09.demo14;


import java.util.ArrayList;

/**
 * @author 86504
 */
public class MainRedPacket {

    public static void main(String[] args) {
        Manager manager = new Manager("群主",1000);
        Member a = new Member("李超",0);
        Member b = new Member("李嘉欣",0);
        Member c = new Member("李自豪",0);

        manager.show();
        a.show();
        b.show();
        c.show();
        System.out.println("================");

//        群主发了20块，发了3个
        ArrayList<Integer> redlist = manager.send(4,3);
//        三个成员去收红包
        a.receive(redlist);
        b.receive(redlist);
        c.receive(redlist);

        manager.show();
//        100-80
        a.show();
//        6~6~8随机分给三个人
        b.show();
        c.show();
    }
}

package com.wensheng.day10.demo01;


/**
 *
 * 接口当中也可以定义”长远变量“，但是必须使用public static final三个关键字进行修饰。
 * 从效果上看，这其实就是接口的【常量】。
 * 格式
 * public static final 书记类型 常量名称 = 数据值;
 *
 * 备注：
 * 一旦使用final关键字进行修饰，说明不可改变。
 *
 * 注意事项：
 * 1、接口当中的常量可以成略public static final，注意：不写也是这样的。
 * 2、接口当中的常量必须进行赋值，不能不赋值。
 * 3、接口中常量的名称，使用完全代谢的字母，用下划线进行分割。(推荐命名规则)
 *
 *
 * */
public interface MyInterfaceConst {

    public static final int NUM_OF_MY_CLASS = 12;
//    这其实就是一个常量，一旦赋值，就不可被修改


}

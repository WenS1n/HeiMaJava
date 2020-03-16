package com.wensheng.day04.demo03;

/**
 * @author 86504
 * <p>
 * 题目要求:
 * 定义以恶个方法，用来判断两个数字是否相同
 */
public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(10, 20));
        System.out.println(isSame(20, 20));
    }

    /*三要素:
     * 返回值类型:boolean
     * 方法名称:isSame
     * 参数列表:int a ,int b
     * */

    public static boolean isSame(int a, int b) {
/*        boolean same;
        if(a == b){
            same = true;
        }else{
            same = false;
        }
        第一种写法
*/

//        boolean same = a == b ? true : false;第二种写法

//        boolean same = a == b;第三种写法

        return a == b;
//        最简写法
    }
}

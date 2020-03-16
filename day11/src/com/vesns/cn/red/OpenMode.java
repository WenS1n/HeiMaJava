package com.vesns.cn.red;

import java.util.ArrayList;

/**
 * @author 86504
 */
public interface OpenMode {

    /**
     * 请将totalMoney分成count分，保存早Array<Integer>中，返回即可。
     *
     * @param totalMoney                总金额为方便计算，已经转换为证书，单位为分。
     * @param totalCount                红包个数。
     * @return ArrayList<Integer>       元素为个位红包的金额值，所有元素的值累和等于总金额
     * */
    ArrayList<Integer> divide(int totalMoney,int totalCount);
}

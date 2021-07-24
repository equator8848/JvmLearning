package com.equator.exception;

import java.util.ArrayList;
import java.util.List;

/**
 * 堆内存溢出 -Xms8m -Xmx8m
 * @Author: Equator
 * @Date: 2021/7/17 22:45
 **/

public class HeapOom {
    public static void main(String[] args) {
        List<DataBean> dataBeans = new ArrayList<>();
        while (true) {
            dataBeans.add(new DataBean());
        }
    }
}

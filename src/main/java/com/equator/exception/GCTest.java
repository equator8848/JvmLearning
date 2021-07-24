package com.equator.exception;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * 堆内存溢出 -Xms1m -Xmx1m
 * jstat -gc `jps | grep GCTest | cut -f 1 -d " "` 1000 64
 * @Author: Equator
 * @Date: 2021/7/17 22:45
 **/
public class GCTest {
    public static void main(String[] args) throws InterruptedException {
        List<DataBean> dataBeans = new ArrayList<>();
        int cnt = 0;
        while (true) {
           Thread.sleep(1);
            dataBeans.add(new DataBean());
            System.out.println("times:" + ++cnt);
        }
    }
}

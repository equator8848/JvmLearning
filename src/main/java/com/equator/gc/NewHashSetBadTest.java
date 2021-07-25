package com.equator.gc;

import com.google.common.collect.Sets;
import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * created by libinkai at 2021/7/25
 **/
@Slf4j
public class NewHashSetBadTest {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        Map<String, Set<String>> map = new HashMap<>();
        int N = 10000000;
        for (int i = 0; i < N; i++) {
            // Thread.sleep(1);
            map.putIfAbsent("equator", Sets.newHashSet());
            // do something here ~
        }
        log.info("cost {}", System.currentTimeMillis() - start);
    }
}

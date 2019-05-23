package com.restep.ch01.first;

import java.util.ArrayList;
import java.util.List;

/**
 * java.lang.OutOfMemoryError: Java heap space
 * -XX:+HeapDumpOnOutOfMemoryError -Xms20m -Xmx20m
 * @author restep
 * @date 2019/5/21
 */
public class OutOfMemoryErrorTest {
    public static void main(String[] args) {
        List<Demo> demoList = new ArrayList<>();

        while (true) {
            demoList.add(new Demo());
        }
    }
}

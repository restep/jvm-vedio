package com.restep.ch01.first;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author restep
 * @date 2019/5/21
 */
public class JConsoleTest {
    public JConsoleTest() {
        byte[] byteArr = new byte[128 * 1024];
    }

    public static void main(String[] args) throws InterruptedException {
        TimeUnit.SECONDS.sleep(10L);
        System.out.println("start");

        fill(1000);

        System.out.println("end");
    }

    private static void fill(int num) throws InterruptedException {
        List<JConsoleTest> jList = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            TimeUnit.MILLISECONDS.sleep(100L);

            jList.add(new JConsoleTest());
        }
    }
}

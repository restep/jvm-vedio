package com.restep.ch01.first;

/**
 * java.lang.StackOverflowError
 *
 * @author restep
 * @date 2019/5/22
 */
public class StackOverFlowErrorTest {
    public static void main(String[] args) {
        StackOverFlowErrorTest stack = new StackOverFlowErrorTest();
        stack.test();
    }

    private void test() {
        test();
    }
}

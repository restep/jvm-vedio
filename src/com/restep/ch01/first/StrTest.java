package com.restep.ch01.first;

/**
 * @author restep
 * @date 2019/5/22
 */
public class StrTest {
    public static void main(String[] args) {
        //s1和s2放运行时常量池
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);

        String s3 = new String("abc");
        System.out.println(s1 == s3);
        //intern() 将存放在堆中的对象放入运行时常量池
        System.out.println(s1 == s3.intern());
    }
}

package com.bj58.iwork.guoyao.think_in_java.chapter3;

/**
 * Created by javior on 16/9/17.
 */
public class TestEqual {

    public static void main(String[] args) {
        String a = "a";
        String b = "a";
        System.out.println(new Integer(2) == 2);
        System.out.println(new Integer(2) == new Integer(2));
        System.out.println(a == b);
        System.out.println(new String("a").intern() == "a");
        System.out.println(a == b);
        System.out.println(new String("a") == new String("a"));
    }

}

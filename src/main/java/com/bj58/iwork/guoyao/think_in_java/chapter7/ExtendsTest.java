package com.bj58.iwork.guoyao.think_in_java.chapter7;

/**
 * Created by javior on 16/9/20.
 */
public class ExtendsTest {
    public static void main(String[] args) {

    }
}
class A{{
    System.out.println("B+");
}
    static {
        System.out.println("A");
    }
    {
        System.out.println("A+");
    }
}
class B extends A{
    static {
        System.out.println("B");
    }
    {
        System.out.println("B+");
    }
}
class C extends B{
    public static void main(String[] args) {

    }
    static {
        System.out.println("C");
    }
    {
        System.out.println("C+");
    }
}
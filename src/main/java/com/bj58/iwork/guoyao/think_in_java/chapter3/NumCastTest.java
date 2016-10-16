package com.bj58.iwork.guoyao.think_in_java.chapter3;

/**
 * Created by javior on 16/9/18.
 */
public class NumCastTest {

    public static void main(String[] args) {

        int i = 0xffffffff;
        a:
        System.out.println(~i);
        switchTest(4);


    }


    static void switchTest(int i){
        switch (i){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            default:
                System.out.println("default");
            case 3:
                System.out.println(3);
                break;

        }


    }


}

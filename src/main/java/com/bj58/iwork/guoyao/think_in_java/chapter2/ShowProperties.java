package com.bj58.iwork.guoyao.think_in_java.chapter2;

/**
 * Created by javior on 16/9/16.
 */
public class ShowProperties {

    /**
     * @see com.bj58.iwork.guoyao.Hello
     * @author guoyao
     * @version 1.0
     * @since 1.0
     * @param args
     * @return nothing
     *
     */
    public static void main(String[] args) {
        System.getProperties().list(System.out);
    }
}

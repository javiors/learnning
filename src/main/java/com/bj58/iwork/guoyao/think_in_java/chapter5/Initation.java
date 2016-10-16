package com.bj58.iwork.guoyao.think_in_java.chapter5;

/**
 * Created by javior on 16/9/18.
 */
public class Initation {


    public Initation() {

    }

    public Initation(String msg) {
        this();
    }

    public Initation(Integer id) {
        this();
    }

    public static void main(String[] args) {
        // overload
        //printInt(1l);  error:
        printInt((char)1);
        printInt((short)1);


    }

    static void doHello(String... strings){

    }

    /*static void doHello(String... strings,String string){

    }*/

    static void print(Object o){
        System.out.println("object:"+o);
    }

    static void print(String o){
        System.out.println("string:"+o);
    }

    static void printInt(int o){
        System.out.println("int:"+o);
    }

    static void print(byte o){
        System.out.println("byte:"+o);
    }

    static void print(long o){
        System.out.println("long:"+o);
    }

    static void print(float o){
        System.out.println("float:"+o);
    }

    static void print(double o){
        System.out.println("object:"+o);
    }

    /**
     *
     * 在类的内部,变量的初始化顺序,取决于变量定义的顺序,
     *
     * */
}

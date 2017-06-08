package com.bj58.iwork.guoyao.awesome.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.Test;

/**
 * Created by javior on 16/10/16.
 */
public class GuoyaoTest {
    @Test
    public void test(){
        Guoyao guoyao = ConfigFactory.create(Guoyao.class);

        System.out.println(guoyao.name());
        System.out.println(guoyao.age());
        System.out.println(guoyao.sex());
    }



}

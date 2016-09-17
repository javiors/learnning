package com.bj58.iwork.guoyao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by javior on 16/9/16.
 */
public class HelloTest {

    @Before
    public void begin(){
        System.out.println("beginning...");
    }

    @Test
    public void hello(){
        Hello.hello();
    }

    @After
    public void end(){
        System.out.println("ending...");
    }


}

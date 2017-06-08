package com.bj58.iwork.guoyao.awesome.owner;

import org.aeonbits.owner.Config;

/**
 * Created by javior on 16/10/16.
 */
@Config.Sources("classpath:guoyao.properties")
public interface Guoyao extends Config{
    public String name();
    @DefaultValue("10")
    public int age();
    public String sex();
}

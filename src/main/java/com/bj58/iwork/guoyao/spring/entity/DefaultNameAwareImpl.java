package com.bj58.iwork.guoyao.spring.entity;

/**
 * Created by javior on 2017/6/17.
 */
public class DefaultNameAwareImpl implements NameAware {
    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}

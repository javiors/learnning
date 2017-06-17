package com.bj58.iwork.guoyao.spring.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by javior on 2017/6/15.
 */
@Component
public class CDPlayer {
    @Autowired
    CD cd;

    public void play(){
        cd.play(1);
        cd.stop();
    }
}

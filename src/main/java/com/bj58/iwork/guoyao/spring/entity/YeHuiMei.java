package com.bj58.iwork.guoyao.spring.entity;

import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by javior on 2017/6/16.
 */
@Component
@Profile("offline")
public class YeHuiMei implements CD {
    static String[] songs = {"以父之名","晴天"};
    @Override
    public void play(int i) {
        System.out.println(songs[i]);
    }

    @Override
    public void stop() {
        System.out.println("叶惠美stopping");
    }
}

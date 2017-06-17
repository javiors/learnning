package com.bj58.iwork.guoyao.spring.entity;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by javior on 2017/6/15.
 */
@Component
@Profile("dev")
public class QiLiXiang implements CD {
    static String[] songs = {"七里香","乱舞春秋"};
    @Override
    public void play(int i) {
        System.out.println(songs[i]);
    }

    @Override
    public void stop() {
        System.out.println("七里香stopping");
    }
}

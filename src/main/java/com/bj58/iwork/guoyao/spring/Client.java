package com.bj58.iwork.guoyao.spring;

import com.bj58.iwork.guoyao.spring.config.Config;
import com.bj58.iwork.guoyao.spring.entity.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by javior on 2017/6/15.
 */
public class Client {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        context.getBean(CDPlayer.class).play();
        NameAware awareBean = (NameAware) context.getBean(YeHuiMei.class);

        System.out.println(awareBean.name());
    }
}

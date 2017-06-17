package com.bj58.iwork.guoyao.spring.config;

import com.bj58.iwork.guoyao.spring.entity.CD;
import com.bj58.iwork.guoyao.spring.entity.CDPlayer;
import com.bj58.iwork.guoyao.spring.entity.QiLiXiang;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

/**
 * Created by javior on 2017/6/15.
 */
@Configuration
@EnableAspectJAutoProxy
@PropertySource("classpath:guoyao.properties")
@ComponentScan(basePackageClasses = CDPlayer.class)
public class Config {
    @Value("${name}")
    private String name;
    @Value("${sex}")
    private String sex;
    @Value("${age}")
    private int age;

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Config{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}

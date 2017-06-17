package com.bj58.iwork.guoyao.spring.entity;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * Created by javior on 2017/6/17.
 */
@Aspect
@Component
public class NameIntroducer {
    @DeclareParents(value = "com.bj58.iwork.guoyao.spring.entity.CD+",
    defaultImpl = DefaultNameAwareImpl.class)
    public static NameAware nameAware;
}

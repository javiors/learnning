package com.bj58.iwork.guoyao.event;

/**
 * Created by 58 on 2017/6/8.
 */
public abstract class Handler<T extends BaseContext> {
    abstract void handle(T context);
    void register(Event event){
        event.bind(this);
    }
}

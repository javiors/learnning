package com.bj58.iwork.guoyao.event;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 58 on 2017/6/8.
 */
public class Event<K extends BaseContext>{
    private Event(){}

    List<Handler<K>> handlers = new ArrayList<>();

    public static final Event<NihaoContext> NIHAO = new Event<>();
    public static final Event<ZaijianContext> ZAIJIN = new Event<>();


    void bind(Handler<K> handler){
        handlers.add(handler);
    }

    @Override
    public String toString() {
        return "";
    }

    public static void main(String[] args) {
        System.out.println(NIHAO);
    }
}

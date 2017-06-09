package com.bj58.iwork.guoyao.event;

/**
 * Created by 58 on 2017/6/8.
 */
public class Client {
    public static void main(String[] args) {
        new NihaoHandler().register(Event.NIHAO);
        trigger(Event.NIHAO,new NihaoContext());
    }

     static <K extends BaseContext> void trigger(Event<K> event,K context){
        for(Handler<K> handler:event.handlers)
            handler.handle(context);
    }
}

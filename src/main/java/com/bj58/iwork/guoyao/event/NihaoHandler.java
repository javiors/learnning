package com.bj58.iwork.guoyao.event;

/**
 * Created by 58 on 2017/6/8.
 */
public class NihaoHandler extends Handler<NihaoContext> {
    @Override
    public void handle(NihaoContext context) {
        System.out.println(context.getClass());

    }
}

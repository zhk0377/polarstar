package com.polarstar.gofpattern.behavior.command;

/**
 * 命令请求者 Created by zhangxuegang on 2016/5/10.
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        super();
        this.command = command;
    }


    public void setCommand(Command command) {
        this.command = command;
    }

    public void call() {
        command.excute();
    }
}

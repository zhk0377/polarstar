package com.polarstar.gofpattern.behavior.command;

/**
 * Created by zhangxuegang on 2016/5/10.
 */
public class ConcreteCommand implements Command {

    public ConcreteCommand(Receiver receiver) {
        super();
        this.receiver = receiver;
    }

    private Receiver receiver;

    @Override
    public void excute() {
        receiver.action();
    }
}

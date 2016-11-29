package com.polarstar.gofpattern.behavior.command;

/**
 * Created by zhangxuegang on 2016/5/10.
 */
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.call();

    }

}

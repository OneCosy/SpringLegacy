package com.bit.aop.basic2;

public class Marine implements Unit {
    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    @Override
    public void doCommand() {
        command.command();
    }
}

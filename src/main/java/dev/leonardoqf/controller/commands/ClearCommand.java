package dev.leonardoqf.controller.commands;

import dev.leonardoqf.model.CalcModel;

public class ClearCommand implements Command {
    
    private final CalcModel model;

    public ClearCommand(CalcModel model) {
        this.model = model;
    }

    @Override
    public void execute() {
        model.clear();
    }
}

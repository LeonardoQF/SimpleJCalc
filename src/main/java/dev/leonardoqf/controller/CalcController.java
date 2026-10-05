package dev.leonardoqf.controller;

import dev.leonardoqf.controller.commands.ClearCommand;
import dev.leonardoqf.model.CalcModel;
import dev.leonardoqf.controller.commands.*;
import dev.leonardoqf.view.CalcFrame;

public class CalcController {

    private final CalcModel model;
    private final CalcFrame view;

    public CalcController(CalcModel model, CalcFrame view) {
        this.model = model;
        this.view = view;

        setupListeners();
    }

    private void executeCommand(Command command) {
        command.execute();
        updateView();
    }

    public void updateView() {
        view.getInputField().setText("");
        view.getOutputPanel().getResultLabel().setText(String.valueOf(model.getResult()));
    }

    private void setupListeners() {
        Command clear = new ClearCommand(model);

        view.getButtonsPanel().getClearButton().addActionListener(e -> executeCommand(clear));
    }

}
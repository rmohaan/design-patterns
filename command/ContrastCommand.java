package com.codewithmosh.command;

public class ContrastCommand implements UndoableCommand {
    private float prevContrast;
    private VideoEditor editor;
    private History history;

    public ContrastCommand(VideoEditor editor, History history) {
        this.editor = editor;
        this.history = history;
    }

    @Override
    public void execute() {
        prevContrast = editor.getContrast();
        editor.setContrast((float)5.5);
        history.push(this);
    }

    @Override
    public void unexecute() {
        editor.setContrast(prevContrast);
    }
}
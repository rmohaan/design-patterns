package com.codewithmosh;

import com.codewithmosh.command.ContrastCommand;
import com.codewithmosh.command.History;
import com.codewithmosh.command.UndoCommand;
import com.codewithmosh.command.UndoableCommand;
import com.codewithmosh.command.VideoEditor;

public class Main {

    public static void main(String[] args) {
    // write your code here
    
        var videoEditor = new VideoEditor();
        var history = new History();
        var contrastCommand = new ContrastCommand();

        contrastCommand.execute();

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();



    }
}

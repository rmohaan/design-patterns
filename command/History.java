package com.codewithmosh.command;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<UndoableCommand> commands = new ArrayList<UndoableCommand>();

    public void push(UndoableCommand command) {
        commands.add(command);
    }

    public UndoableCommand pop () {
        commands.pop();
    }

    public int size() { 
        return commands.size();
    }
}
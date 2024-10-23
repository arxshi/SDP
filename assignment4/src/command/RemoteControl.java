package command;

import java.util.Stack;

public class RemoteControl {
    private Command[] commandSlots;
    private Stack<Command> commandHistory;

    public RemoteControl(int numSlots) {
        commandSlots = new Command[numSlots];
        commandHistory = new Stack<>();
    }

    public void setCommand(int slot, Command command) {
        commandSlots[slot] = command;
    }

    public void pressButton(int slot) {
        if (commandSlots[slot] != null) {
            commandSlots[slot].execute();
            commandHistory.push(commandSlots[slot]);
        }
    }

    public void pressUndo() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
        } else {
            System.out.println("Nothing to undo.");
        }
    }
}


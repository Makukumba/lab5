package commands;

import Managers.CommandManager;

import java.io.IOException;

public class ClearCommand extends AbstractCommand{
    CommandManager cm;
    public ClearCommand(CommandManager cm) {
        super("clear", "очистить информацию о коллекции");
        this.cm = cm;
    }

    public void execute() throws IOException {
        cm.clear();

    }
}



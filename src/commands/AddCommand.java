package commands;

import Managers.CommandManager;

import java.io.IOException;

public class AddCommand extends AbstractCommand{
      CommandManager cm;
    public AddCommand(CommandManager cm) {
        super("add", "добавить элемент в коллекцию");
        this.cm = cm;
    }

    public void execute() throws IOException {
    cm.add();

    }
}


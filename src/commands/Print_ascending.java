package commands;

import Managers.CommandManager;

import java.io.IOException;

public class Print_ascending extends AbstractCommand {
    CommandManager cm;

    public Print_ascending(CommandManager cm) {
        super("print_ascending", "вывести элементы коллекции в порядке возрастания");
        this.cm = cm;
    }

    public void execute() throws IOException {
        cm.show();
    }
}
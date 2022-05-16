package commands;

import Managers.CommandManager;

import java.io.IOException;

public class RemoveById extends AbstractCommand {
    CommandManager cm;

    public RemoveById(CommandManager cm) {
        super("remove_by_id", "удалить элемент из коллекции по его id");
        this.cm = cm;
    }

    public void execute() throws IOException {
        cm.remove_by_id();
    }
}

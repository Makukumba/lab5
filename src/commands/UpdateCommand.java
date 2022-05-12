package commands;

import Managers.CommandManager;

import java.io.IOException;

public class UpdateCommand extends AbstractCommand {
    CommandManager cm;
    public UpdateCommand(CommandManager cm) {
        super("update_by_id", "обновить значение элемента коллекции, id которого равен заданному");
        this.cm = cm;
    }


    public void execute() throws IOException {
    cm.update();
    }
}
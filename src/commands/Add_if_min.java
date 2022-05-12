package commands;

import Managers.CommandManager;

import java.io.IOException;

public class Add_if_min extends AbstractCommand{
    CommandManager cm;
    public Add_if_min(CommandManager cm) {
        super("add_if_min", "добавить новый элемент в коллекцию, если его значение меньше, чем у наименьшего элемента этой коллекции");
this.cm = cm;
    }

    public void execute() throws IOException {
    cm.add_if_min();

    }
}
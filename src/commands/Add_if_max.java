package commands;

import Managers.CommandManager;

import java.io.IOException;

public class Add_if_max extends AbstractCommand{
CommandManager cm;
    public Add_if_max(CommandManager cm) {
        super("add_if_max", "добавить новый элемент в коллекцию, если его значение превышает значение наибольшего элемента этой коллекции");
    this.cm = cm;
    }

    public void execute() throws IOException {
        cm.add_if_max();

    }
}

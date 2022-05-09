package commands;

import commands.AbstractCommand;
import exceptions.WrongAmountOfElementsException;

public class InfoCommand extends AbstractCommand {
    public InfoCommand() {
        super("info", "вывести в стандартный поток вывода информацию о коллекции");
    }

}

package commands;

import commands.AbstractCommand;
import exceptions.WrongAmountOfElementsException;

public class InfoCommand extends AbstractCommand {
    public InfoCommand() {
        super("info", "вывести в стандартный поток вывода информацию о коллекции");
    }



    public  boolean execute(String argument) {
        try {
            if (!argument.isEmpty()) throw new WrongAmountOfElementsException();
            return true;
        } catch (WrongAmountOfElementsException exception) {
            System.out.println("Использование: '" + getName() + "'");
        }
        return false;
    }

}

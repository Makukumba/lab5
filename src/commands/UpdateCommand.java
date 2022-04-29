package commands;

import Drago.DragonChecker;
import commands.AbstractCommand;
import exceptions.WrongAmountOfElementsException;

import java.time.LocalDateTime;

public class UpdateCommand extends AbstractCommand {
    public UpdateCommand() {
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
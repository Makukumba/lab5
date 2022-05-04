package commands;

import Drago.Dragon;
import exceptions.*;
import Drago.DragonChecker;

public class AddCommand extends AbstractCommand{
    public AddCommand() {
        super("add", "добавить элемент в коллекцию");
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

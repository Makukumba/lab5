package commands;
import Drago.Dragon;
import exceptions.*;
import Drago.DragonChecker;
public class RemoveLowerCommand extends AbstractCommand{
    public RemoveLowerCommand() {
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

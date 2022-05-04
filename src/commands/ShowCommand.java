package commands;
import exceptions.WrongAmountOfElementsException;

public class ShowCommand extends AbstractCommand{

        public ShowCommand() {
            super("show", "показывает доступные коллекции");
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
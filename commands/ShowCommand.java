package commands;
import exceptions.WrongAmountOfElementsException;

public class ShowCommand extends AbstractCommand{

        public ShowCommand() {
            super("show", "вывести в стандартный поток вывода все элементы коллекции в строковом представлении");
        }


    }
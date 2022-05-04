package commands;


import exceptions.WrongAmountOfElementsException;

public class SaveCommand extends AbstractCommand{
    public SaveCommand() {
        super("save", "сохраняет коллекцию в файл");
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
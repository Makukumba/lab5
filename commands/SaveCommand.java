package commands;


import exceptions.WrongAmountOfElementsException;

public class SaveCommand extends AbstractCommand{
    public SaveCommand() {
        super("save", "сохранить коллекцию в файл");
    }


}
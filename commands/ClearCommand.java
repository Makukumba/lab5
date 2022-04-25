package commands;

import Drago.Dragon;
import exceptions.*;
import Managers.CollectionManager;
import Drago.DragonChecker;

public class ClearCommand extends AbstractCommand{
    private CollectionManager collectionManager;

    public ClearCommand(CollectionManager collectionManager) {
        super("clear", "очистить коллекцию");
        this.collectionManager = collectionManager;
    }
    public boolean execute(String argument) {
        try {
            if (!argument.isEmpty()) throw new AmountException();
            collectionManager.clearCollection();
            System.out.println("Коллекция очищена!");
            return true;
        } catch (AmountException exception) {
            System.out.println("Использование: '" + getName() + "'");
        }
        return false;
    }
}
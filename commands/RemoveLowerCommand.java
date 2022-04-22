package commands;
import Drago.Dragon;
import exceptions.*;
import Managers.CollectionManager;
import Drago.DragonChecker;
public class RemoveLowerCommand extends AbstractCommand{
    private CollectionManager collectionManager;
    private DragonChecker dragonChecker;

    public RemoveLowerCommand(CollectionManager collectionManager, DragonChecker dragonChecker) {
        super("remove_lower {element}", " удалить из коллекции все элементы, меньшие, чем заданный");
        this.collectionManager = collectionManager;
        this.dragonChecker = dragonChecker;
    }}
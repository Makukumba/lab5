package commands;
import Drago.Dragon;
import exceptions.*;
import Managers.CollectionManager;
import Drago.DragonChecker;
public class PrintAscending extends AbstractCommand{
    private CollectionManager collectionManager;
    private DragonChecker dragonChecker;

    public PrintAscending(CollectionManager collectionManager, DragonChecker dragonChecker) {
        super("print_ascending", " вывести элементы коллекции в порядке возрастания");
        this.collectionManager = collectionManager;
        this.dragonChecker = dragonChecker;
    }}
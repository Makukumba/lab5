package commands;
import Drago.Dragon;
import exceptions.*;
import Managers.CollectionManager;
import Drago.DragonChecker;
public class RemoveAnyByDD extends AbstractCommand{
    private CollectionManager collectionManager;
    private DragonChecker dragonChecker;

    public RemoveAnyByDD(CollectionManager collectionManager, DragonChecker dragonChecker) {
        super("remove_any_by_description description", " удалить из коллекции один элемент, значение поля description которого эквивалентно заданному");
        this.collectionManager = collectionManager;
        this.dragonChecker = dragonChecker;
    }}
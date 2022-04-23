//добавить новый элемент в коллекцию, если его значение превышает значение наибольшего элемента этой коллекции
package commands;

import Drago.Dragon;
import exceptions.*;
import Managers.CollectionManager;
import Drago.DragonChecker;

import java.time.LocalDateTime;

public class AddIfMaxCommand extends AbstractCommand{
    private CollectionManager collectionManager;
    private DragonChecker dragonChecker;

    public AddIfMaxCommand(CollectionManager collectionManager, DragonChecker dragonChecker) {

        super("add_if_max {element}", "добавить новый элемент, если его значение больше, чем у наибольшего в коллекции");
        this.collectionManager = collectionManager;
        this.dragonChecker = dragonChecker;
    }}
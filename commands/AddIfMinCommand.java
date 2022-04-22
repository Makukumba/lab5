//добавить новый элемент в коллекцию, если его значение не превышает значение наименьшего элемента этой коллекции
package commands;

import Drago.Dragon;
import exceptions.*;
import Managers.CollectionManager;
import Drago.DragonChecker;

import java.time.LocalDateTime;

public class AddIfMinCommand extends AbstractCommand{
    private CollectionManager collectionManager;
    private DragonChecker dragonChecker;

    public AddIfMinCommand(CollectionManager collectionManager, DragonChecker dragonChecker) {

        super("add_if_max {element}", "добавить новый элемент, если его значение меньше, чем у наименьшего в коллекции");
        this.collectionManager = collectionManager;
        this.dragonChecker = dragonChecker;
    }}
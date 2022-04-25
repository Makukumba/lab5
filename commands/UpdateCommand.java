package commands;

import Drago.DragonChecker;
import Managers.CollectionManager;
import commands.AbstractCommand;

import java.time.LocalDateTime;

public class UpdateCommand extends AbstractCommand {
    private CollectionManager collectionManager;
    private DragonChecker dragonChecker;

    public UpdateCommand(CollectionManager collectionManager, DragonChecker dragonChecker) {
        super("update <ID> {element}", "обновить значение элемента коллекции по ID");
        this.collectionManager = collectionManager;
        this.dragonChecker = dragonChecker;
    }}
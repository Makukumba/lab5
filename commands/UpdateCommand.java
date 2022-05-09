package commands;

import Drago.DragonChecker;
import commands.AbstractCommand;
import exceptions.WrongAmountOfElementsException;

import java.time.LocalDateTime;

public class UpdateCommand extends AbstractCommand {
    public UpdateCommand() {
        super("update_by_id", "обновить значение элемента коллекции, id которого равен заданному");
    }


}
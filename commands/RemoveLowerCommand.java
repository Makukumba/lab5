package commands;
import Drago.Dragon;
import exceptions.*;
import Drago.DragonChecker;
public class RemoveLowerCommand extends AbstractCommand{
    public RemoveLowerCommand() {
        super("remove_lower", "удалить из коллекции все элементы, меньшие, чем заданный");
    }


}

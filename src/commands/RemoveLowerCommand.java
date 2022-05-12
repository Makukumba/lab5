package commands;
import Managers.CommandManager;

import java.io.IOException;

public class RemoveLowerCommand extends AbstractCommand{
    CommandManager cm;
    public RemoveLowerCommand(CommandManager cm) {
        super("remove_lower", "удалить из коллекции все элементы, меньшие, чем заданный");
        this.cm=cm;
    }
    public void execute() throws IOException {
    cm.remove_lower();
    }
}

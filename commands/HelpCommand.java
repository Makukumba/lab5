package commands;
import exceptions.AmountException;
public class HelpCommand extends AbstractCommand{
    public HelpCommand() {
        super("help", "вывести справку по доступным командам");
    }
}


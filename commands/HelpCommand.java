package commands;
import exceptions.AmountException;
public class HelpCommand extends AbstractCommand{
    public HelpCommand() {
        super("help", "вывести справку по доступным командам");
    }
    public boolean execute(String argument) {
        try {
            if (!argument.isEmpty()) throw new AmountException();
            return true;
        } catch (AmountException exception) {
            System.out.println("Использование: '" + getName() + "'");
        }
        return false;
    }
}
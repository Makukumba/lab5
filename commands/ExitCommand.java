package commands;
import exceptions.AmountException;
public class ExitCommand extends AbstractCommand{
    public ExitCommand() {
        super("exit", "завершить программу (без сохранения в файл)");
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
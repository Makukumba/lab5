package commands;
import exceptions.AmountException;
public class ExitCommand extends AbstractCommand{


    public ExitCommand() {
        super("exit", "завершить программу (без сохранения в файл)");
    }
}

package commands;
import Managers.CommandManager;

public class ExitCommand extends AbstractCommand{
CommandManager cm;

    public ExitCommand(CommandManager cm) {
        super("exit", "завершить программу (без сохранения в файл)");
        this.cm = cm;
    }


    public void execute() {
        cm.exit();

    }
}

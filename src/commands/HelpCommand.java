package commands;

import java.util.HashMap;
import java.util.Map;

public class HelpCommand extends AbstractCommand {
    private HashMap<String, Command> commands;

    public HelpCommand(HashMap<String, Command> commands) {
        super("help", "вывести справку по доступным командам");
        this.commands = commands;
    }

    public void execute() {
        for (Map.Entry<String, Command> command : commands.entrySet()) {
            System.out.print(command.getValue().getName() + ": ");
            System.out.println(command.getValue().getDescription());
        }

    }
}


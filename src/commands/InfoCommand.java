package commands;

import Managers.CommandManager;

public class InfoCommand extends AbstractCommand {
    CommandManager cm;
    public InfoCommand(CommandManager cm) {
        super("info", "вывести в стандартный поток вывода информацию о коллекции");
    this.cm=cm;
    }


    public void execute() {
        cm.info();

    }
}

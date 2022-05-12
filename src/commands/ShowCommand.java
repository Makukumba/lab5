package commands;
import Managers.CommandManager;

import java.io.IOException;

public class ShowCommand extends AbstractCommand{
 CommandManager cm;
        public ShowCommand(CommandManager cm) {
            super("show", "вывести в стандартный поток вывода все элементы коллекции в строковом представлении");
        this.cm = cm;
        }



    public void execute() throws IOException {

        cm.show();
    }
}
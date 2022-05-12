package commands;


import Managers.CommandManager;

import java.io.IOException;

public class SaveCommand extends AbstractCommand{
    CommandManager cm;
    public SaveCommand(CommandManager cm) {
        super("save", "сохранить коллекцию в файл");
        this.cm = cm;
    }



    public void execute() throws IOException {
        cm.save();
    }
}
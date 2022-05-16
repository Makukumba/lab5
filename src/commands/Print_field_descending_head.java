package commands;

import Managers.CommandManager;

import java.io.IOException;

public class Print_field_descending_head extends AbstractCommand {
    CommandManager cm;

    public Print_field_descending_head(CommandManager cm) {
        super("print_field_descending_head", "вывести значения поля head всех элементов в порядке убывания");
        this.cm = cm;
    }

    public void execute() throws IOException {
        cm.print_field_descending_head();

    }
}
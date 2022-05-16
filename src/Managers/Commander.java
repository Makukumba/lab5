package Managers;

import Drago.Dragon;
import commands.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Commander {
    private HashMap<String, Command> commands;

    public Commander(CommandManager cm) {
        commands = new HashMap<>();
        commands.put("help", new HelpCommand(commands));
        commands.put("info", new InfoCommand(cm));
        commands.put("show", new ShowCommand(cm));
        commands.put("add", new AddCommand(cm));
        commands.put("update", new UpdateCommand(cm));
        commands.put("remove_by_id", new RemoveById(cm));
        commands.put("clear", new ClearCommand(cm));
        commands.put("save", new SaveCommand(cm));
        commands.put("execute_script", new Execute_script(commands));
        commands.put("exit", new ExitCommand(cm));
        commands.put("add_if_max", new Add_if_max(cm));
        commands.put("add_if_min", new Add_if_min(cm));
        commands.put("remove_lower", new RemoveLowerCommand(cm));
        commands.put("remove_any_by_description", new Remove_any_by_description(cm));
        commands.put("print_ascending", new Print_ascending(cm));
        commands.put("print_field_descending_head", new Print_field_descending_head(cm));
    }

    public void start() throws IOException {

        while (true) {
            Scanner s = new Scanner(System.in);
            String text = s.nextLine();
            int a = 0;
            for (Map.Entry<String, Command> command : commands.entrySet()) {

                if (text.equals(command.getKey())) {
                    command.getValue().execute();
                    a = 1;
                }
            }
            if (a == 0) {
                System.out.println("Команда не найдена");
            }
        }
    }
}

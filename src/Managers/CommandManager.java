package Managers;
import java.util.HashMap;
import Drago.Dragon;
import Managers.CollectionManager;
import commands.*;
import commands.AddIfMaxCommand;
import commands.AddIfMinCommand;
import commands.ClearCommand;
import commands.Command;
import commands.ExecuteScriptCommand;
import commands.ExitCommand;
import commands.HelpCommand;
import commands.InfoCommand;
import commands.RemoveLowerCommand;
import commands.SaveCommand;
import commands.ShowCommand;
import commands.UpdateCommand;

public class CommandManager {
    private HashMap<String, Command> commands;


    public CommandManager(CollectionManager collectionManager, Dragon dragonChecker) {
        commands = new HashMap<>();
        commands.put("help", new HelpCommand());
        commands.put("info", new InfoCommand(collectionManager));
        commands.put("show", new ShowCommand(collectionManager));
        commands.put("add", new AddCommand(collectionManager, dragonChecker));
        commands.put("update", new UpdateCommand(collectionManager, dragonChecker));
        commands.put("remove_by_ID", new RemoveByIdCommand(collectionManager));
        commands.put("clear", new ClearCommand(collectionManager));
        commands.put("save", new SaveCommand(collectionManager));
        commands.put("execute_script", new ExecuteScriptCommand());
        commands.put("exit", new ExitCommand());
        commands.put("add_if_min", new AddIfMinCommand(collectionManager, dragonChecker));
        commands.put("add_if_max", new AddIfMaxCommand(collectionManager, dragonChecker));
        commands.put("remove_lower", new RemoveLowerCommand(collectionManager, dragonChecker));
      //  commands.put("print_field_descending_head", )

    }

    public void executor(String commandName, String arguments) {
        Command command = commands.get(commandName);
        Command.execute(arguments);
    }
    public HashMap<String, Command> getCommands() {
        return commands;
    }


    public boolean noSuchCommand(String command) {
        System.out.println("Команда '" + command + "' не найдена. Напишите 'help', чтобы узнать какие команды есть в этой программе.");
        return false;
    }

    public void help(String argument) {
        if (HelpCommand.execute(argument)) {
            for (Command commands : commands) {
                System.out.println(command.getName(), command.getDescription());
            }
            return true;
        } else return false;
    }
    public boolean info(String argument) {
        return InfoCommand.execute(argument);
    }
    public boolean show(String argument) {
        return ShowCommand.execute(argument);
    }


}
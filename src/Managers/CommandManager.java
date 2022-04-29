package Managers;

import commands.Command;
import commands.ExitCommand;
import commands.HelpCommand;
import commands.InfoCommand;

import java.util.HashMap;

public class CommandManager {
    HashMap<String, Command> commands;
    public CommandManager() {
        commands = new HashMap<>();
        commands.put("help", new HelpCommand());
        commands.put("info", new InfoCommand());
        commands.put("exit", new ExitCommand());
    }
    public void execute(String commandName, String arguments) {
        Command command = commands.get(commandName);
        command.execute(arguments);}
    public HashMap<String, Command> getCommands() {
        return commands;
    }
    public void help(){
        System.out.println(commands.values());
    }
    public void info(){

    }
    public void exit(){
        System.exit(0);
    }
}











      /**  commands.put("help", new HelpCommand());
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
*/

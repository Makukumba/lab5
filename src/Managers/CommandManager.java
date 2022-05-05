package Managers;

import Drago.Dragon;
import com.sun.source.tree.Tree;
import commands.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class CommandManager {
    HashMap<String, Command> commands;
    public CommandManager() {
        commands = new HashMap<>();
        commands.put("help", new HelpCommand());
        commands.put("info", new InfoCommand());
        commands.put("exit", new ExitCommand());
        commands.put("add", new AddCommand());
        commands.put("clear", new ClearCommand());
        commands.put("removelower", new RemoveLowerCommand());
        commands.put("save", new SaveCommand());
        commands.put("show", new ShowCommand());
        commands.put("update", new UpdateCommand());

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
    public void info(TreeSet ts){
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        int month = date.getMonthValue();
        int dayOfMonth = date.getDayOfMonth();
        System.out.println("Коллекция типа TreeSet");
        System.out.println("Количество элементов в коллекции " +ts.size());
        System.out.println("Дата создания коллекции: " +date );

// Нужно доДЕОЛАЯТЬЬЬ
    }
    public void exit(){
        System.out.println("завершение работы");
        System.exit(0)
        ;
    }
    public void add(TreeSet ts) throws IOException {
        JWriter jWriter = new JWriter();
        jWriter.write(ts);
    }
    public void show (TreeSet ts) {
        System.out.println("Выводим информация о коллекции");
            System.out.println(ts);}
public void save(TreeSet ts) throws IOException {
JWriter jWriter = new JWriter();
jWriter.save(ts);}
public void print_ascending(TreeSet ts)throws IOException{
        System.out.println(ts.last());
}
public void cler(TreeSet ts){
        ts.clear();
}

public void add_if_max(TreeSet ts){
        JWriter jWriter = new JWriter();
        jWriter.writeif(ts);
        }
public void add_if_min(TreeSet ts){
        JWriter jWriter = new JWriter();
        jWriter.writeif1(ts);
}
public void remove_by_id(TreeSet ts){

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

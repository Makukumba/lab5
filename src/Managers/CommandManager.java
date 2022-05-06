package Managers;

import Drago.Dragon;
import com.sun.source.tree.Tree;
import commands.*;

import java.io.IOException;
import java.time.DayOfWeek;
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
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        if (ts.size() == 0) {
            System.out.println("Ошибка, Сначала добавьте элементы в коллекцию");
        }
        else{
        System.out.println("Коллекция типа TreeSet");
        System.out.println("Количество элементов в коллекции " +ts.size());
        System.out.println("Дата создания коллекции: " +date);

// Нужно доДЕОЛАЯТЬЬЬ
    }}
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
public void clear(TreeSet ts){
        ts.clear();
        System.out.println("Коллекция очищена");
}

public void add_if_max(TreeSet ts){
        JWriter jWriter = new JWriter();
        jWriter.writeif(ts);
        }
public void add_if_min(TreeSet ts){
        JWriter jWriter = new JWriter();
        jWriter.writeif1(ts);
}
public void ss(TreeSet<Dragon> ts) {

        Scanner scanner = new Scanner(System.in);
        long s = scanner.nextLong();
    if (ts.first().getId() == s) {
        ts.remove(ts.first());

    }
    else { System.out.println("Дракона с таким id не существует");
    }
    }
    public Dragon remove_by_id(TreeSet<Dragon> ts) {
        System.out.print("Введите id: ");
        Scanner scanner = new Scanner(System.in);
        long s = scanner.nextLong();
       // Dragon dragonn = new Dragon(null,null,null,null,0,0,null, null);
        for (Dragon dragon : ts) {
            if (dragon.getId() == s)
            { //dragonn = dragon;
                ts.remove(dragon);
                System.out.println("Дракон с id "+s+" удален");
                break;
            }
            else {
                System.out.println("Дракона с таким id не существует");
            }
        }
        return null;
    }
    public void remove_by_d(TreeSet<Dragon> ts){
        System.out.print("Введите описание: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (Dragon dragon : ts){
            if (dragon.getDescription().equals(s)){
                ts.remove(dragon);
                System.out.println("Дракон с описанием "+s+" удален");
                break;
            }
            else{
                System.out.println("Дракона с таким описанием не существует");
            }
        }
    }
}














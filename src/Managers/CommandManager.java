package Managers;

import Drago.Dragon;
import Drago.DragonCharacter;
import com.sun.source.tree.Tree;

import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class CommandManager {
    public void help(){
      System.out.println("help : вывести справку по доступным командам");
      System.out.println("info : вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)");
      System.out.println("show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении");
      System.out.println("add {element} : добавить новый элемент в коллекцию");
      System.out.println("update id {element} : обновить значение элемента коллекции, id которого равен заданному");
      System.out.println("remove_by_id id : удалить элемент из коллекции по его id");
      System.out.println("clear : очистить коллекцию");
      System.out.println("save : сохранить коллекцию в файл");
      System.out.println("execute_script file_name : считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.");
      System.out.println("exit : завершить программу (без сохранения в файл)");
      System.out.println("add_if_max {element} : добавить новый элемент в коллекцию, если его значение превышает значение наибольшего элемента этой коллекции");
      System.out.println("add_if_min {element} : добавить новый элемент в коллекцию, если его значение меньше, чем у наименьшего элемента этой коллекции");
      System.out.println("remove_lower {element} : удалить из коллекции все элементы, меньшие, чем заданный");
      System.out.println("remove_any_by_description description : удалить из коллекции один элемент, значение поля description которого эквивалентно заданному");
      System.out.println("print_ascending : вывести элементы коллекции в порядке возрастания");
      System.out.println("print_field_descending_head : вывести значения поля head всех элементов в порядке убывания");
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
    }}
    public void exit(){
        System.out.println("завершение работы");
        System.exit(0)
        ;
    }
    public void add(TreeSet ts) throws IOException {
        JWriter jWriter = new JWriter();
        jWriter.write(ts);
        System.out.println("Дракон успешно добавлен в коллекцию");
    }
    public void show (TreeSet<Dragon> ts) {
        System.out.println("Выводим информация о коллекции");
        for (Dragon dragon : ts) {
            System.out.println(dragon);
        }
        // System.out.println(ts);}
    }
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
        jWriter.ifmax(ts);
        System.out.println("Дракон успешно добавлен в коллекцию");
        }
public void add_if_min(TreeSet ts){
        JWriter jWriter = new JWriter();
        jWriter.ifmin(ts);
        System.out.println("Дракон успешно добавлен в коллекцию");
}
    public void remove_by_id(TreeSet<Dragon> ts) {


            System.out.print("Введите id: ");
       try {
           Scanner scanner = new Scanner(System.in);
           long s = scanner.nextLong();
        for (Dragon dragon : ts) {
            if (dragon.getId() == s)
            {
                ts.remove(dragon);
                System.out.println("Дракон с id "+s+" удален");
                break;
            }
        }}
       catch (InputMismatchException exception){
           System.out.println("Значение id должно быть представлено числом");}
       catch (NullPointerException exception){System.out.println("Поле не может быть null");}
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
        }

    }
    public void update(TreeSet<Dragon> ts){
        System.out.print("Введите id дракона: ");
        try{
        Scanner scanner = new Scanner(System.in);
        long s = scanner.nextLong();
        for (Dragon dragon : ts){
            if(dragon.getId() == s){
                System.out.print("Введите новый id дракона: ");
                Scanner scanner1 = new Scanner(System.in);
                Long s1 = scanner1.nextLong();
                Dragon dragonn = new Dragon(s1, dragon.getName(), dragon.getCoordinates(), dragon.getDescription(), dragon.getAge(), dragon.getWeight(), DragonCharacter.EVIL, dragon.getHead());
                ts.remove(dragon);
                ts.add(dragonn);
                System.out.println("id дракона заменён");
                break;
        }
    }
}catch (InputMismatchException exception){
            System.out.println("Значение id должно быть представлено числом");}
        catch (NullPointerException exception){System.out.println("Поле не может быть null");}
    }
        public void remove_lower( TreeSet<Dragon> ts){
        System.out.println("Введите id дракона: ");
        try{
        Scanner scanner = new Scanner(System.in);
        long s = scanner.nextLong();
        for (Iterator<Dragon> iterator  = ts.iterator(); iterator .hasNext();) {
            Dragon dragon = iterator.next();
            if(dragon.getId() < s) {
                iterator.remove();
            }
        }
    } catch (InputMismatchException exception){
            System.out.println("Значение id должно быть представлено числом");}
        catch (NullPointerException exception){System.out.println("Поле не может быть null");}
    }
    public void execute_script(TreeSet<Dragon> ts){
        Parser p = new Parser();
        p.parse1(ts);
    }
    public void print_field_descending_head(TreeSet<Dragon> ts){
        for (Dragon dragon : ts){
            System.out.print(dragon.getHead() +" ");
        }
    }
}














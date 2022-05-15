package Managers;

import Drago.Dragon;
import Drago.DragonCharacter;
import Drago.DragonChecker;
import Drago.HeadComparatop;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.source.tree.Tree;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class CommandManager {
    String dragonFile = System.getenv("jjson");
    DragonChecker dragonChecker = new DragonChecker();
    TreeSet<Dragon> ts = new TreeSet();
    public TreeSet<Dragon> read() {
        Parser parser = new Parser();
        ts = parser.parse(ts);
        return ts;
    }
    public void info(){
        LocalDate date = LocalDate.now();
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
        System.exit(0);
    }
    public TreeSet<Dragon>  add() throws IOException {
        Dragon dragon = new Dragon(dragonChecker.ID(), dragonChecker.NAME(), dragonChecker.COORDINATES(), dragonChecker.DESCRIPTION(), dragonChecker.AGE(), dragonChecker.WEIGHT(), dragonChecker.CHAR(), dragonChecker.dragonHead());
        ts.add(dragon);
        System.out.println("Дракон успешно добавлен в коллекцию");
        return ts;
    }
    public void show () {
        System.out.println("Выводим информация о коллекции");
        for (Dragon dragon : ts) {
            System.out.println(dragon);
        }
    }
public void save() throws IOException {
    Gson gson = new GsonBuilder().create();
    File file = new File(dragonFile);
    OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(file));
    gson.toJson(ts, writer);
    writer.close();
    System.out.println("Коллекция записана в файл " + file);}
public TreeSet <Dragon> clear(){
        ts.clear();
        System.out.println("Коллекция очищена");
        return ts;
}

public TreeSet <Dragon> add_if_max(){
    while(true){
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите id: ");
            long iD = scanner.nextLong();
            if (iD > ts.last().getId()){
                Dragon dragon = new Dragon(iD, dragonChecker.NAME(), dragonChecker.COORDINATES(), dragonChecker.DESCRIPTION(), dragonChecker.AGE(), dragonChecker.WEIGHT(), dragonChecker.CHAR(), dragonChecker.dragonHead());
                ts.add(dragon);
                System.out.println("Дракон успешно добавлен в коллекцию");
                break;
            }
            else {
                System.out.println("id должен быть больше, чем "+ts.last().getId()+ ". Попробуйте снова");
            }

        }catch (InputMismatchException exception){
            System.out.println("Значение id должно быть представлено числом");}
        catch (NullPointerException exception){System.out.println("Поле не может быть null");}}
        return ts;
        }
public TreeSet <Dragon> add_if_min(){
    while (true) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите id: ");
            long iD = scanner.nextLong();
            if (iD <= 0) {
                System.out.println("id должен быть больше 0");
            } else if (iD < ts.first().getId()) {
                Scanner scanner1 = new Scanner(System.in);
                Dragon dragon = new Dragon(iD, dragonChecker.NAME(), dragonChecker.COORDINATES(), dragonChecker.DESCRIPTION(), dragonChecker.AGE(), dragonChecker.WEIGHT(), dragonChecker.CHAR(), dragonChecker.dragonHead());
                ts.add(dragon);
                System.out.println("Дракон успешно добавлен в коллекцию");
                break;
            } else {
                System.out.println("id должен быть меньше, чем " + ts.first().getId() + ". Попробуйте снова");
            }

        } catch (InputMismatchException exception) {
            System.out.println("Значение id должно быть представлено числом");
        } catch (NullPointerException exception) {
            System.out.println("Поле не может быть null");
        }
    }
return ts;
    }
    public TreeSet <Dragon> remove_by_id() {
        int a = 0;
        while ( a ==0){
            System.out.print("Введите id: ");
       try {
           Scanner scanner = new Scanner(System.in);
           long s = scanner.nextLong();
        for (Dragon dragon : ts) {
            if (dragon.getId() == s)
            {
                ts.remove(dragon);
                System.out.println("Дракон с id "+s+" удален");
                a = 1;
                break;
            }
        }if (a==0){System.out.println("Дракона с таким id не существует");}
       }
       catch (InputMismatchException exception){
           System.out.println("Значение id должно быть представлено числом");}
       catch (NullPointerException exception){System.out.println("Поле не может быть null");}}
    return ts;
    }
    public TreeSet <Dragon> remove_by_d(){
        int a = 0;
        while (a==0){
        System.out.print("Введите описание: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (Dragon dragon : ts){
            if (dragon.getDescription().equals(s)){
                ts.remove(dragon);
                System.out.println("Дракон с описанием "+s+" удален");
                a = 1;
                break;
            }
        }
        if(a==0){
            System.out.println("Дракона с таким описанием не существует, поробуйте снова");
        }}
    return ts;
    }
    public TreeSet <Dragon> update(){
        int a =0;
        while(a ==0){
            try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите id дракона: ");
            long s = scanner.nextLong();
        for (Dragon dragon : ts){
            if(dragon.getId() == s){
                System.out.print("Введите новый id дракона: ");
                Scanner scanner1 = new Scanner(System.in);
                Long s1 = scanner1.nextLong();
                Dragon dragonn = new Dragon(s1, dragon.getName(), dragon.getCoordinates(), dragon.getDescription(), dragon.getAge(), dragon.getWeight(), DragonCharacter.EVIL, dragon.getHead());
                ts.remove(dragon);
                ts.add(dragonn);
                System.out.println("id дракона обновлён");
                 a =1;
                break;
        }
    }
            if (a==0){
                System.out.println("Дракона с таким id не существует, попробуйте снова");
            }
}catch (InputMismatchException exception){
            System.out.println("Значение id должно быть представлено числом, попробуйте снова");}
        catch (NullPointerException exception){System.out.println("Поле не может быть null, попробуйте снова");}}

   return ts;}
        public TreeSet<Dragon> remove_lower(){

        int a = 0;
        while (a==0){

        try{
            System.out.print("Введите id дракона: ");
            Scanner scanner = new Scanner(System.in);
            long s = scanner.nextLong();
        for (Iterator<Dragon> iterator  = ts.iterator(); iterator .hasNext();) {
            Dragon dragon = iterator.next();
            if(dragon.getId() < s) {
                iterator.remove();
                System.out.println("Драконы с id меньше, чем "+s+" удалены" );
                a=1;
                break;
            }
        }
        if(a==0){System.out.println("Драконов с id, меньше, чем "+s+" не существует, попробуйте снова");}
    } catch (InputMismatchException exception){
            System.out.println("Значение id должно быть представлено числом, поробуйте снова");}
        catch (NullPointerException exception){System.out.println("Поле не может быть null");}}
   return ts;
    }
    public void print_field_descending_head(){
        Set set = new TreeSet(new HeadComparatop());
        for (Dragon dragon : ts){
        set.add(dragon.getHead());
        }
      for (Object o : set){
            System.out.println(o);
        }
    }}















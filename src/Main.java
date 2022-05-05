
import java.io.IOException;
import java.time.DayOfWeek;
import java.util.Scanner;
import java.util.TreeSet;

import Drago.Dragon;
import Managers.*;
//import commands.*;
import Drago.DragonChecker;
import com.google.gson.internal.bind.util.ISO8601Utils;
import commands.Command;


public class Main {


    public static void main(String[] args) throws IOException {
        TreeSet ts = new TreeSet();
        CommandManager cm = new CommandManager();
        System.out.print("Для начала работы введите команду help ");
        Scanner scanner1 = new Scanner(System.in);
        String text1 = scanner1.nextLine();
        String s = "help";
        if (text1.equals(s)) {
            cm.help();}
        else {System.out.println("Завершение работы");
            System.exit(0);}
        while (true) {

            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            String a = "help";
            String b = "exit";
            String c = "info";
            String d = "add";
            String e = "show";
            String f = "save";
            String g = "print_ascending";
            String h = "clear";
            String i = "add_if_max";
            String j = "add_if_min";
            if (text.equals(a)) {
                cm.help();
            } else if (text.equals(b)) {
                cm.exit();
            } else if (text.equals(c)) {
                cm.info(ts);
            } else if (text.equals(d)) {
                cm.add(ts);
            } else if (text.equals(e)) {
                cm.show(ts);
            } else if (text.equals(f)) {
                cm.save(ts);
            }
            else if (text.equals(g)){
                cm.print_ascending(ts);
            }
            else if(text.equals(h)) {
            cm.cler(ts);
            }
            else if (text.equals(i)){
            cm.add_if_max(ts);
            }
            else if (text.equals(j)) {
            cm.add_if_min(ts);
            }
            else {
                System.out.println("Ошибка, неправильное имя команды! Попробуйте снова");
        }

    }}}



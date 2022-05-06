
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
        Parser parser = new Parser();

        TreeSet ts = new TreeSet();
        CommandManager cm = new CommandManager();
        System.out.print("Для начала работы введите команду help ");
        Scanner scanner1 = new Scanner(System.in);
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
            String k = "remove_by_id";
            String l = "remove_by_d";
            //parser.parse(ts);
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
            cm.clear(ts);
            }
            else if (text.equals(i)){
            cm.add_if_max(ts);
            }
            else if (text.equals(j)) {
            cm.add_if_min(ts);
            }
            else if (text.equals(k)){
                cm.remove_by_id(ts);
            }
            else if (text.equals(l)){
                cm.remove_by_d(ts);
            }
            else {
                System.out.println("Ошибка, неправильное имя команды! Попробуйте снова");
        }

    }}}



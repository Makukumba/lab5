
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


    public static void main(String[] args) throws IOException
    {
        TreeSet ts = new TreeSet();
        CommandManager cm = new CommandManager();
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String a = "help";
        String b = "exit";
        String c = "info";
        String d = "add";
        String e = "show";
        String f = "save";
        if (text.equals(a))
        { cm.help();}
        else if (text.equals(b)){
            cm.exit();
        }
        else if (text.equals(c)){
            cm.info();
        }
        else if (text.equals(d))
        {cm.add(ts);}
        else if (text.equals(e))
        {cm.show(ts);}
        String text1 = scanner.nextLine();
        if (text1.equals(a))
        { cm.help();}
        else if (text1.equals(b)){
            cm.exit();
        }
        else if (text1.equals(c)){
            cm.info();
        }
        else if (text1.equals(d))
        {cm.add(ts);}
        else if (text1.equals(e))
        {cm.show(ts);}
        String text2 = scanner.nextLine();
        if (text2.equals(a))
        { cm.help();}
        else if (text2.equals(b)){
            cm.exit();
        }
        else if (text2.equals(c)){
            cm.info();
        }
        else if (text2.equals(d))
        {cm.add(ts);}
        else if (text2.equals(e))
        {cm.show(ts);}
        else if (text2.equals(f)){
            cm.save(ts);
        }
        String text3 = scanner.nextLine();
        if (text3.equals(a))
        { cm.help();}
        else if (text3.equals(b)){
            cm.exit();
        }
        else if (text3.equals(c)){
            cm.info();
        }
        else if (text3.equals(d))
        {cm.add(ts);}
        else if (text3.equals(e))
        {cm.show(ts);}
        else if (text3.equals(f)){
            cm.save(ts);
        }
    }

}


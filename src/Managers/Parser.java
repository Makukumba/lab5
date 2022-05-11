package Managers;

import Drago.Dragon;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Scanner;
import java.util.TreeSet;

public class Parser {
    public TreeSet <Dragon> parse(TreeSet <Dragon> ts){
        Gson gson = new Gson();
        String dragonFile = System.getenv("jjson");
        try(FileReader reader = new FileReader(dragonFile)){
            Scanner scan = new Scanner(reader);
            Type collectionType = new TypeToken<TreeSet<Dragon>>() {}.getType();
            ts = gson.fromJson(scan.nextLine().trim(), collectionType);
            return ts;
        }
        catch (Exception e ){
            System.out.println("Parsing error"+e.toString());

        }

        return ts;}
    public TreeSet<Dragon> parse1(TreeSet<Dragon> ts){
      CommandManager cm = new CommandManager();
        try (FileReader reader = new FileReader("dragon.json")){
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNext()){
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
                String l = "remove_by_description";
                String m = "update_id";
                String n = "remove_lower";
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
                else if (text.equals(m)){
                    cm.update(ts);
                }
                else if (text.equals(n)){
                    cm.remove_lower(ts);
                }
                else{
                    System.out.println("В файле нету команд");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ts;
    }
}

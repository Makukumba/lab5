package Managers;

import Drago.Dragon;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.Scanner;
import java.util.TreeSet;

public class Parser {
    public TreeSet<Dragon> parse(TreeSet ts){
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

        return ts;}}

package Managers;

import Drago.Dragon;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.Scanner;
import java.util.TreeSet;

public class Parser {
    public ParseHelper parse(){
        Gson gson = new Gson();
        try(FileReader reader = new FileReader("C:\\Users\\Public\\lab5\\dragon.json")){
            Scanner scan = new Scanner(reader);
            ParseHelper parseHelper = new ParseHelper();

            TreeSet<Dragon> collection;
            Type collectionType = new TypeToken<TreeSet<Dragon>>() {}.getType();
            collection = gson.fromJson(scan.nextLine().trim(), collectionType);
            parseHelper.setDragon(collection);

            return parseHelper;
        }
        catch (Exception e ){
            System.out.println("Parsing error"+e.toString());
        }
        return new ParseHelper(); }
}

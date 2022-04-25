package Managers;

import com.google.gson.Gson;

import java.io.FileReader;

public class Parser {
    public ParseHelper parse(){
        Gson gson = new Gson();

        try (FileReader reader = new FileReader("C:\\Users\\Public\\lab5\\src\\dragon.json")){
            ParseHelper parseHelper = gson.fromJson(reader, ParseHelper.class);

            return parseHelper;
        } catch (Exception e){
            System.out.println("Parsing error" + e.toString());
        }
        return null;
    }}

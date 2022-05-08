package Managers;

import Drago.Coordinates;
import Drago.Dragon;
import Drago.DragonChecker;
import Drago.DragonHead;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

import static Drago.DragonCharacter.EVIL;

public class JWriter {
    DragonChecker dragonChecker = new DragonChecker();
    public JWriter write(TreeSet ts)  {

       // Scanner scanner = new Scanner(System.in);
        //System.out.print("Введите id: ");
        long iD = 1+ new Random().nextLong();
        Dragon dragon = new Dragon(iD, dragonChecker.NAME(), dragonChecker.COORDINATES(), dragonChecker.DESCRIPTION(), dragonChecker.AGE(), dragonChecker.WEIGHT(), EVIL, dragonChecker.dragonHead());
        ts.add(dragon);

        return null;
    }
    public void writeif(TreeSet<Dragon> ts)  {
        while(true){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите id: ");
        long iD = scanner.nextLong();
        if (iD > ts.last().getId()){
            Dragon dragon = new Dragon(iD, dragonChecker.NAME(), dragonChecker.COORDINATES(), dragonChecker.DESCRIPTION(), dragonChecker.AGE(), dragonChecker.WEIGHT(), EVIL, dragonChecker.dragonHead());
            ts.add(dragon);
            break;
        }
        else {
            System.out.println("id не подходит, поробуйте снова");
        }

        }}
    public void writeif1(TreeSet<Dragon> ts) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите id: ");
            long iD = scanner.nextLong();
            if (iD < ts.first().getId()) {
                Scanner scanner1 = new Scanner(System.in);
                Dragon dragon = new Dragon(iD, dragonChecker.NAME(), dragonChecker.COORDINATES(), dragonChecker.DESCRIPTION(), dragonChecker.AGE(), dragonChecker.WEIGHT(), EVIL, dragonChecker.dragonHead());
                ts.add(dragon);
                break;
            } else {
                System.out.println("id не подходит, попробуйте снова");
            }

        }}
    public void save(TreeSet ts) throws IOException{
            Gson gson = new GsonBuilder().create();
            File file = new File("dragon1.json");
            OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(file));
            gson.toJson(ts, writer);
            writer.close();
            System.out.println("Коллекция записана в файл " + file);

    }
}
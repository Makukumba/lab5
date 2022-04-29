package Managers;
import Drago.Coordinates;
import Drago.Dragon;
import Drago.DragonHead;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import static Drago.DragonCharacter.EVIL;

public class JWriter {
  /**  private static final Gson gson = new GsonBuilder().create();
    Scanner scanner = new Scanner(System.in);
    String namE = scanner.nextLine();
    long iD = scanner.nextLong();
    int X = scanner.nextInt();
    long Y = scanner.nextLong();
    Coordinates coordinateS = new Coordinates(X,Y);
    // Scanner scanner1 = new Scanner(System.in);
   // String descriptioN = scanner1.nextLine();
    String descriptioN = "kj[";
    int weighT = scanner.nextInt();
    int agE = scanner.nextInt();
    double Ey = scanner.nextDouble();
    DragonHead heaD = new DragonHead(Ey);
    Dragon dragon = new Dragon(iD, namE, coordinateS ,descriptioN,agE, weighT, EVIL,heaD);
    String json = gson.toJson( dragon );
   */
    public JWriter write() throws IOException {
        Gson gson = new GsonBuilder().create();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите id: ");
        long iD = scanner.nextLong();
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String namE = scanner1.nextLine();
        System.out.print("Введите координаты: ");
        int X = scanner.nextInt();
        long Y = scanner.nextLong();
        Coordinates coordinateS = new Coordinates(X,Y);
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Описание: ");
        String descriptioN = scanner2.nextLine();
        System.out.print("Введите вес: ");
        int weighT = scanner.nextInt();
        System.out.print("Введите возраст: ");
        int agE = scanner.nextInt();
        System.out.print("Введите количество глаз   : ");
        double Ey = scanner.nextDouble();
        DragonHead heaD = new DragonHead(Ey);
        Dragon dragon = new Dragon(iD, namE, coordinateS ,descriptioN,agE, weighT, EVIL,heaD);
        String json = gson.toJson( dragon );
        File file = new File("dragon1.json" );
        OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(file, true));
       // writer.write("[");
        writer.append(json);
       // writer.write("]");
        writer.close();
        return null;
    }

    }
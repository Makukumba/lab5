package Drago;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DragonChecker {
    private long id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDate creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private int age; //Значение поля должно быть больше 0
    private String description; //Поле не может быть null
    private Integer weight; //Значение поля должно быть больше 0, Поле может быть null
    private DragonCharacter character; //Поле не может быть null
    private DragonHead head;
    //public long ID(){

    //}
public String NAME(){
    String name = null;
    while (name == null) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите имя Дракона: ");
        name = input.nextLine();
        if (name.equals("")) {
            System.out.println("Некорректное описание. Повторите попытку.");
        }

        else {
            break;
        }
    }
    return name;}


public int X(){
int x;

Scanner input = new Scanner(System.in);
System.out.print("Введите координату x: ");
    x = input.nextInt();
    if(x<= Coordinates.min_x){
System.out.println("Ошибка! Число должно быть больше, чем " + Coordinates.min_x);
    }
   else{ System.out.print("");
}
return x;
}
public long Y(){
    long y;
    Scanner input = new Scanner(System.in);
    System.out.print("Введите координату y: ");
    y = input.nextInt();
    if(y<= Coordinates.min_y){
        System.out.println("Ошибка! Число должно быть больше, чем " + Coordinates.min_y);
    }
    else {return y;}
    return y;
}
public Coordinates COORDINATES(){
    int x;
    long y;
    x =X();
    y = Y();
    return new Coordinates(x,y);
}
    public String DESCRIPTION() {
        String description = null;
        while (description == null) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите описание Дракона: ");
            description = input.nextLine();
            if (description.equals("")) {
                System.out.println("Некорректное описание. Повторите попытку.");
            }

            else {
                break;
            }
        }
        return description;
    }
    public int AGE(){
        int age = -1;
        int a = 0;
        while (age <= a) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите значение возраста: ");
            age = input.nextInt();
            if (age <= a) {
                System.out.println("Ошибка! Число должно быть больше, чем " + a);
            } else {
                break;
            }
        }
        return age;
    }
    public Integer WEIGHT() {
        int weight = -1;
        int a = 0;
        while (weight <= a) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите значение веса: ");
            weight = input.nextInt();
            if (weight <= a) {
                System.out.println("Ошибка! Число должно быть больше, чем " + a);
            } else {
                break;
            }
        }
        return weight;
    }
    public double EYES(){
        Double e = null;

        while(e ==null){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество глаз: ");
        e = input.nextDouble();
        if(e==null){System.out.println("Попробуйте снова!");}
        else {break;}

    }return e;}
   public DragonHead dragonHead(){
double eyesCount;
       eyesCount=EYES();
   return new DragonHead(eyesCount);
}
}







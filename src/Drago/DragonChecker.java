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
public String NAME(){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите имя Дракона: ");
        name = input.nextLine();
        if (name.equals("")) {
        System.out.println("Некорректное имя. Повторите попытку.");}
         else if(name ==null){System.out.println("Некорректное имя. Повторите попытку.");}
        else  {System.out.println(name);
    }
return name;}
public int X(){
int x;

Scanner input = new Scanner(System.in);
System.out.println("Введите координату x");
    x = input.nextInt();
    if(x<= Coordinates.min_x){
System.out.println("Ошибка! Число должно быть больше, чем " + Coordinates.min_x);
    }
   else{ System.out.println(x);
}
return x;
}
public long Y(){
    long y;
   // long Y;
    Scanner input = new Scanner(System.in);
    System.out.println("Введите координату y");
    y = input.nextInt();
    if(y<= Coordinates.min_y){
        System.out.println("Ошибка! Число должно быть больше, чем " + Coordinates.min_y);
    }
    else {System.out.println(y);}
return y;
}
public Coordinates COORDINATES(){
    int x;
    long y;
    x =X();
    y = Y();
    return new Coordinates(x,y);


}
//public void CReationDate(){
  //  long random = ThreadLocalRandom.current().nextLong(startDate.getTime(), endDate.getTime());
   // Date date = new Date(random);
    public int AGE(){
        int age;

        Scanner input = new Scanner(System.in);
        System.out.println("Введите значение возраста");
        age = input.nextInt();
        if(age<= 0){
            System.out.println("Ошибка! Число должно быть больше, чем " + 0);
        }
        else{ System.out.println(age);
        }
        return age;
    }
    public Integer WEIGHT(){
    int weight;
    int a = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите значение веса");
        weight = input.nextInt();
        if(weight<= a){
            System.out.println("Ошибка! Число должно быть больше, чем " + a);
        }
        else{ System.out.println(weight);
        }
        return weight;
    }
    //public Drago.DragonCharacter character(){

    //}
    //return character;
//private data.DragonHead head(){

//}
//public Dragon createElement(Long id) {
  //  return new Dragon(id, name,  COORDINATES(x, y), creationDate, age,description,weight);
}







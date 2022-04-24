package Drago;
import java.time.LocalDate;
public class Dragon implements Comparable<Dragon>  {
    private Long id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private  Coordinates coordinates; //Поле не может быть null
    //private java.time.LocalDate creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private int age; //Значение поля должно быть больше 0
    private String description; //Поле не может быть null
    private Integer weight; //Значение поля должно быть больше 0, Поле может быть null
    private DragonCharacter character; //Поле не может быть null
    private DragonHead head;
    public Dragon(long id, String name, Coordinates coordinates,
                  //LocalDate creationDate,
                  int age,String description, Integer weight) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.coordinates = coordinates;
        //this.creationDate = creationDate;
        //this.age = age;
        this.description = description;
        this.weight = weight;

    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Coordinates getCoordinates() {
        return coordinates;
    }
  //  public LocalDate getCreationDate() {
  //      return creationDate;
  //  }
/**  public int getAge(){return age;}
    public String getDescription(){return description;}
    public Integer getWeight(){return weight;}
    public String toString() {
        String information = "Получить ифнормацию о Драконе \n";
        information += "Дракон" + id;
        information += "\n Имя: " + name;
        //information += "\n добавлен " + creationDate;
        information += "\n Местоположение: " + coordinates;
        information += "\n Возраст: " + age;
        information += "\n Описание: " + description;
        information += "\n Вес: " + weight;
        return information;
    }
*/

    public int compareTo(Dragon o) {
int result =this.id.compareTo(o.id);
        return result;
    }
}



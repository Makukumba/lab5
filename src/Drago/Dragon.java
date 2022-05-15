package Drago;

import java.time.LocalDate;

public class Dragon implements Comparable<Dragon> {
    private Long id;
    private String name;
    private Coordinates coordinates;
    private String description;
    private int age;
    private Integer weight;
    private DragonCharacter character;
    private DragonHead head;
    public Dragon(Long id, String name, Coordinates coordinates, String description, int age, int weight, DragonCharacter character, DragonHead head) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.description = description;
        this.age = age;
        this.weight = weight;
        this.character = character;
        this.head = head;


    }
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public String getDescription() {
        return description;
    }

    public Integer getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public DragonCharacter getCharacter() {
        return character;
    }

    public DragonHead getHead() {
        return head;
    }

    public int compareTo(Dragon dragon) {

        return id.compareTo(dragon.getId());
    }
    public String toString() {
        return " Id: " + id+ " Имя: " + name +   " Координаты: " + "(" + coordinates + ")" + " Возраст: " + age + " Описание: " + description + " Вес: " + weight + " Характер: " + character + " Количество глаз: " + head;
    }

}



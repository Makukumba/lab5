package Drago;

import Managers.CommandManager;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class DragonChecker {
    public long ID(TreeSet<Dragon> ts) {
        long id;
        if (ts.last() == null) {
            id = 1;
        } else {
            id = ts.last().getId() + 1;
        }
        return id;
    }

    public String NAME() {
        String name = null;
        while (name == null) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите имя Дракона: ");
            name = input.nextLine();
            if (name.equals("")) {
                System.out.println("Некорректное имя. Повторите попытку.");
            } else {
                break;
            }
        }
        return name;
    }


    public int X() {
        Integer x = 0;
        while (x == 0) {
            try {
                System.out.print("Введите координату x: ");
                Scanner input = new Scanner(System.in);
                x = input.nextInt();
                if (x <= Coordinates.min_x) {
                    System.out.println("Ошибка! Число должно быть больше, чем " + Coordinates.min_x);
                }
            } catch (InputMismatchException exception) {
                System.out.println("Значение x должно быть представлено числом");
            } catch (NullPointerException exception) {
                System.out.println("Поле не может быть null");
            }
        }
        return x;
    }

    public long Y() {
        long y = 0;
        while (y == 0) {
            try {

                Scanner input = new Scanner(System.in);
                System.out.print("Введите координату y: ");
                y = input.nextInt();
                if (y <= Coordinates.min_y) {
                    System.out.println("Ошибка! Число должно быть больше, чем " + Coordinates.min_y);
                }
            } catch (InputMismatchException exception) {
                System.out.println("Значение y должно быть представлено числом");
            } catch (NullPointerException exception) {
                System.out.println("Поле не может быть null");
            }
        }
        return y;
    }

    public Coordinates COORDINATES() {
        int x;
        long y;
        x = X();
        y = Y();
        return new Coordinates(x, y);
    }

    public String DESCRIPTION() {
        String description = null;
        while (description == null) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите описание Дракона: ");
            description = input.nextLine();
            if (description.equals("")) {
                System.out.println("Некорректное описание. Повторите попытку.");
            } else {
                break;
            }
        }
        return description;
    }

    public int AGE() {
        int age = -1;
        int a = 0;
        while (age <= a) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Введите значение возраста: ");
                age = input.nextInt();
                if (age <= a) {
                    System.out.println("Ошибка! Число должно быть больше, чем " + a);
                } else {
                    break;
                }
            } catch (InputMismatchException exception) {
                System.out.println("Значение age должно быть представлено числом");
            } catch (NullPointerException exception) {
                System.out.println("Поле не может быть null");
            }
        }
        return age;
    }

    public Integer WEIGHT() {
        int weight = -1;
        int a = 0;
        while (weight <= a) {
            try {


                Scanner input = new Scanner(System.in);
                System.out.print("Введите значение веса: ");
                weight = input.nextInt();
                if (weight <= a) {
                    System.out.println("Ошибка! Число должно быть больше, чем " + a);
                } else {
                    break;
                }
            } catch (InputMismatchException exception) {
                System.out.println("Значение weight должно быть представлено числом");
            } catch (NullPointerException exception) {
                System.out.println("Поле не может быть null");
            }
        }
        return weight;
    }

    public DragonCharacter CHAR() {
        DragonCharacter dragonCharacter;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String a = "1";
            String b = "2";
            String c = "3";
            System.out.print("Введите характер дракона (CUNNING(1) / EVIL(2) / CHAOTIC(3)): ");
            String text = scanner.nextLine();
            if (text.equals(a)) {
                dragonCharacter = DragonCharacter.CUNNING;
                break;
            } else if (text.equals(b)) {
                dragonCharacter = DragonCharacter.EVIL;
                break;
            } else if (text.equals(c)) {
                dragonCharacter = DragonCharacter.CHAOTIC;
                break;
            } else {
                System.out.println("Некорректный ввод, повторите попытку");
            }
        }
        return dragonCharacter;
    }

    public double EYES() {
        Double e = 0.0;

        while (e == 0.0) {
            try {
                System.out.print("Введите количество глаз: ");
                Scanner input = new Scanner(System.in);
                e = input.nextDouble();
                if (e == null) {
                    System.out.println("Попробуйте снова!");
                } else {
                    break;
                }
            } catch (InputMismatchException exception) {
                System.out.println("Значение eyes должно быть представлено числом");
            } catch (NullPointerException exception) {
                System.out.println("Поле не может быть null");
            }
        }
        return e;
    }

    public DragonHead dragonHead() {
        double eyesCount;
        eyesCount = EYES();
        return new DragonHead(eyesCount);
    }
}







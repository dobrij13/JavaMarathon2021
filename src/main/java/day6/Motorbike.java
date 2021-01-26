package day6;
/*
Создать класс Мотоцикл (англ. Motorbike) с полями “Год выпуска”, “Цвет”, “Модель”.
Создать экземпляр класса Мотоцикл, используя конструктор (set методы не использовать).
Необходимо придерживаться принципов инкапсуляции и использовать ключевое слово this.
Вывести в консоль значение каждого из полей, используя get методы.
 */

//2017,"Black", "Harley-Davidson Street Rod"

public class Motorbike {
    private int yearOfIssue;
    private String colour;
    private String model;

    public Motorbike(int yearOfIssue, String colour, String model) {
        this.yearOfIssue = yearOfIssue;
        this.colour = colour;
        this.model = model;
    }


    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getColour() {
        return colour;
    }

    public String getModel() {
        return model;
    }

    public void info() { System.out.println("Это мотоцикл"); }

    public int yearDifference(int inputYear){
        return Math.abs(inputYear - yearOfIssue);

    }
}
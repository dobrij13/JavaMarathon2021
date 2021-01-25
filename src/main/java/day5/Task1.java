package day5;
/*
Создать класс Автомобиль (англ. Car) с полями “Год выпуска”, “Цвет”, “Модель”.
Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль.
Задать значение для каждого поля, используя set методы.
Вывести в консоль значение каждого из полей, используя get методы.
Созданный вами класс должен отвечать принципам инкапсуляции.

 */

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYearOfIssue(2015);
        car1.setColour("Red");
        car1.setModel("Tesla Model S P85D");

        car1.writeYear();
        car1.writeColour();
        car1.writeModel();
    }
}

class Car {
    private int yearOfIssue;
    private String colour;
    private String model;

    public void setYearOfIssue(int carYearOfIssue) {
        yearOfIssue = carYearOfIssue;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setColour(String carColour) {
        colour = carColour;
    }

    public String getColour() {
        return colour;

    }

    public void setModel(String carModel) {
        model = carModel;
    }

    public String getModel() {
        return model;
    }

    void writeYear() {
        System.out.println("Год выпуска: " + yearOfIssue);
    }

    void writeColour() {
        System.out.println("Цвет: " + colour);
    }

    void writeModel() {
        System.out.println("Модель: " + model);
    }
}

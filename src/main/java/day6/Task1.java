package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColour("Black");
        car.setModel("Tesla");
        car.setYearOfIssue(2017);

        Motorbike motorbike = new Motorbike(2017,"Black", "Harley-Davidson Street Rod");

        car.info();
        motorbike.info();
        System.out.println(car.yearDifference(2021));
        System.out.println(motorbike.yearDifference(2021));
    }
}

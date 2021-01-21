package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner floor = new Scanner(System.in);
        int x = floor.nextInt();
        if (x <= 0) {
            System.out.println("Ошибка ввода");
        } else if (x <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (x <= 8) {
            System.out.println("Среднеэтажный дом");
        } else {
            System.out.println("Многоэтажный дом");
        }
    }
}

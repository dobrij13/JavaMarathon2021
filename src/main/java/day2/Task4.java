package day2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        double x = number.nextInt();

        double y;
        if (x >= 5) {
            System.out.println((x * x - 10) / (x + 7));
        } else if (x > -3 && x < 5) {
            System.out.println((x + 3) * (x * x - 2));
        } else {
            System.out.println(420.0);
        }
    }
}

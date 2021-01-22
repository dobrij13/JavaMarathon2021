package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x;

        for (x = 0; x < 5; x++) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            if (b != 0) {
                System.out.println(a / b);
            }
            if (b == 0) {
                System.out.println("Деление на 0");
            }
        }
    }
}

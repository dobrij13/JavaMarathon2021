package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи размер массива:");

        int size = scanner.nextInt();
        int[] array = new int[size];

        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(11);
        }
        System.out.println(Arrays.toString(array));

        System.out.println("Длина массива: " + array.length);

        int lessThen8 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8)
                lessThen8++;
        }
        System.out.println("Количество чисел больше 8: " + lessThen8);

        int number1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1)
                number1++;
        }
        System.out.println("Количество чисел меньше 8: " + number1);

        int evenNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                evenNumbers++;
        }
        System.out.println("Количество четных чисел: " + evenNumbers);

        int notEvenNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                notEvenNumbers++;
        }
        System.out.println("Количество нечетных чисел: " + notEvenNumbers);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумме всех элементов массива: " + sum);
    }
}

package day4;
/*Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
  Затем, используя цикл for each вывести в консоль:
        1 наибольший элемент массива
        2 наименьший элемент массива
        3 количество элементов массива, оканчивающихся на 0
        4 сумму элементов массива, оканчивающихся на 0
        Использовать сортировку запрещено.
*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10001);
        }

        int max = 0;
        for (int x : array) {
            if (x > max) {
                max = x;
            }
        }
        System.out.println("Наибольший элемент массива: " + max);

        int min = 100000;
        for (int x : array) {
            if (x < min) {
                min = x;
            }
        }
        System.out.println("Наименьший элемент массива: " + min);

        int number0 = 0;
        for (int x : array) {
            if (x % 10 == 0) {
                number0++;
            }
        }
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + number0);

        int sum = 0;
        for (int x : array) {
            if (x % 10 == 0) {
                sum += x;
            }
        }
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sum);

    }
}

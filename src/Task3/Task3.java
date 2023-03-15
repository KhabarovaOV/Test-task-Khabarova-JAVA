package Task3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        task3.workWithArray();
    }

    public void workWithArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину одномерного массива:");
        try {
            int lightArray = scanner.nextInt();
            int[] arrayOne = new int[lightArray];
            System.out.println("Введите значения для массива:");
            for (int i = 0; i < arrayOne.length; i++) {
                arrayOne[i] = scanner.nextInt();
            }
            System.out.println("Полученный массив:");
            System.out.println(Arrays.toString(arrayOne));
            int k = 0;
            for (int y : arrayOne) {
                k++;
                if ((y % 3) == 0 && y != 0) {
                    System.out.println(y);
                } else if (k == arrayOne.length) {
                    System.out.println("Чисел кратных 3 не найдено.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число, начни сначала");
            workWithArray();
        }
    }
}


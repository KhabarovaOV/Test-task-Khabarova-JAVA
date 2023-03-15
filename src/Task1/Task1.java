package Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.comparisonOfNumbers();
    }

    public void comparisonOfNumbers() {
        System.out.println("Введите число:");
        try {
            Scanner scanner = new Scanner(System.in);
            int enterNumber = scanner.nextInt();
            int number = 7;
            if (enterNumber > number) {
                System.out.println("Привет");
            } else {
                System.out.println("Вы ввели нечерное число");
                comparisonOfNumbers();
            }
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число");
            comparisonOfNumbers();
        }
    }
}

package Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.comparisonOfText();
    }

    public void comparisonOfText() {
        System.out.println("Введите имя:");
        Scanner scanner = new Scanner(System.in);
        String enterName = scanner.nextLine();
        String name = "Вячеслав";
        if (enterName.equals(name)) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}

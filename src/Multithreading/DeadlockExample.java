package Multithreading;

import java.util.Scanner;

import java.util.Scanner;

public class DeadlockExample {

    public static void main(String[] args) {
        // Задаем годовую процентную ставку
        double annualInterestRate = 0.09; // 9%

        // Создаем объект Scanner для ввода данных от пользователя
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем начальную сумму
        System.out.print("Введите начальную сумму: ");
        double principal = scanner.nextDouble();

        // Запрашиваем количество лет
        System.out.print("Введите количество лет: ");
        int years = scanner.nextInt(); // Изменено на int

        // Вычисляем итоговую сумму после указанного количества лет
        double finalAmount = principal;
        for (int i = 0; i < years; i++) { // Изменено на < years
            finalAmount += finalAmount * annualInterestRate; // Увеличиваем сумму на процент
        }

        // Выводим результат
        System.out.printf("Итоговая сумма: %.2f\n", finalAmount);

        // Закрываем сканер
        scanner.close();
    }
}
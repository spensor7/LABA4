import java.util.Scanner;

public class Masiv50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            // Запитуємо користувача, чи він хоче заповнити масив парними чи непарними числами
            System.out.print("Оберіть, будь ласка, тип чисел (парні - п / непарні - н): ");
            String choice = scanner.next();

            int[] array = new int[50];

            // Заповнюємо масив відповідно до вибору користувача
            if (choice.equalsIgnoreCase("п")) {
                // Заповнюємо масив парними числами
                for (int i = 0; i < array.length; i++) {
                    array[i] = 2 * (i + 1);
                }
            } else if (choice.equalsIgnoreCase("н")) {
                // Заповнюємо масив непарними числами
                for (int i = 0; i < array.length; i++) {
                    array[i] = 2 * i + 1;
                }
            } else {
                System.out.println("Ви ввели неправильний варіант. Будь ласка, спробуйте ще раз.");
                continue;
            }

            // Виводимо заповнений масив
            System.out.println("Заповнений масив:");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();

            // Питаємо користувача, чи він хоче продовжити виконання програми
            System.out.print("Бажаєте продовжити (Так/Ні)? ");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("Так")) {
                exit = true;
            }
        }

        scanner.close();
    }
}
import java.util.Scanner;

public class zavd22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            // Створюємо масив для зберігання введених чисел
            int[] numbers = new int[10];

            // Вводимо числа з клавіатури та заповнюємо масив
            System.out.println("Введіть 10 чисел:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Число " + (i + 1) + ": ");
                if (scanner.hasNextInt()) {
                    numbers[i] = scanner.nextInt();
                } else {
                    System.out.println("Введено неправильне значення. Спробуйте ще раз.");
                    scanner.next(); // Очистка введеного значення
                    i--; // Зменшуємо лічильник, щоб повторити спробу введення
                }
            }

            // Виводимо введені числа
            System.out.println("Введені числа:");
            for (int number : numbers) {
                System.out.print(number + " ");
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
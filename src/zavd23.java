import java.util.Scanner;

public class zavd23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            // Створюємо масив для зберігання введених чисел
            int[] numbers = new int[10];

            // Введення чисел з клавіатури
            System.out.println("Введіть 10 чисел:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Введіть число " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
            }

            // Виведення чисел з непарним індексом
            System.out.println("Числа з непарним індексом:");
            int index = 0;
            while (index < 10) {
                if (index % 2 != 0) {
                    System.out.println(numbers[index]);
                }
                index++;
            }

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
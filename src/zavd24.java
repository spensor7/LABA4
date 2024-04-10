import java.util.Scanner;

public class zavd24 {
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

            // Виведення чисел з парним індексом
            System.out.println("Числа з парним індексом:");
            for (int i = 0; i < numbers.length; i += 2) {
                System.out.println(numbers[i]);
            }

            // Перевірка, чи користувач хоче продовжити
            System.out.print("Бажаєте продовжити? (Так/Ні): ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("Так")) {
                exit = true;
            }
        }
        scanner.close();
    }
}
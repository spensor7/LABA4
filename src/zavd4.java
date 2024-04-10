import java.util.Scanner;

public class zavd4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.print("Введіть кількість елементів масиву: ");
            int n = scanner.nextInt();

            int[] array = new int[n];

            System.out.println("Введіть елементи масиву:");
            for (int i = 0; i < n; i++) {
                System.out.print("Елемент " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                if (array[i] % 2 != 0) {
                    array[i] *= -1; // Зміна знаку непарного елементу
                }
            }

            System.out.println("Масив зі зміненими знаками непарних елементів:");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();

            System.out.print("Бажаєте продовжити? (Так/Ні): ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("Так")) {
                exit = true;
            }
        }
        scanner.close();
    }
}
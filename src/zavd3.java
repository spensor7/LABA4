import java.util.Scanner;

public class zavd3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.print("Введіть кількість елементів масиву: ");
            int n = scanner.nextInt();

            double[] array = new double[n];

            System.out.println("Введіть елементи масиву:");
            for (int i = 0; i < n; i++) {
                System.out.print("Елемент " + (i + 1) + ": ");
                array[i] = scanner.nextDouble();
            }

            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += array[i];
            }

            System.out.println("Сума елементів масиву: " + sum);

            System.out.print("Бажаєте продовжити? (Так/Ні): ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("Так")) {
                exit = true;
            }
        }
        scanner.close();
    }
}
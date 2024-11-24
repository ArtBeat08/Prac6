
import java.util.Scanner;

public class Calculation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введіть кількість кутів багатокутника: ");
        int n = scanner.nextInt();


        if (n < 3) {
            System.out.println("Це не багатокутник!");
            return;
        }


        int[] angles = new int[n];
        System.out.println("Введіть значення кутів:");
        int sum = 0;

        for (int i = 0; i < n; i++) {
            angles[i] = scanner.nextInt();
            sum += angles[i];
        }


        int expectedSum = 180 * (n - 2);
        if (sum == expectedSum) {
            System.out.println("Багатокутник можливий.");
        } else {
            System.out.println("Багатокутник неможливий.");
        }
    }
}

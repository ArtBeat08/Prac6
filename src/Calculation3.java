import java.util.Scanner;
import java.util.Random;

public class Calculation3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();
        int[] array = new int[size];


        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(50);
        }

        System.out.println("Початковий масив:");
        for (int num : array) {
            System.out.print(num + " ");
        }


        System.out.print("\nВведіть значення для пошуку: ");
        int searchValue = scanner.nextInt();
        System.out.print("Введіть значення для заміни: ");
        int replaceValue = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == searchValue) {
                array[i] = replaceValue;
                found = true;
            }
        }

        if (found) {
            System.out.println("Оновлений масив:");
            for (int num : array) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("Значення не знайдено у масиві.");
        }
    }
}

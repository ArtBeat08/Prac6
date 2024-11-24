import java.util.Scanner;
import java.util.Random;

public class Calculation5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();
        int[] array = new int[size];


        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Згенерований масив:");
        for (int num : array) {
            System.out.print(num + " ");
        }


        System.out.print("\nПеревірити на зростання чи спадання? (1 - зростання, 2 - спадання) : ");
        int choice = scanner.nextInt();

        boolean isOrdered = true;
        if (choice == 1) {
            for (int i = 1; i < size; i++) {
                if (array[i] < array[i - 1]) {
                    isOrdered = false;
                    break;
                }
            }
        } else if (choice == 2) {
            for (int i = 1; i < size; i++) {
                if (array[i] > array[i - 1]) {
                    isOrdered = false;
                    break;
                }
            }
        } else {
            System.out.println("Невірний вибір!");
            return;
        }

        System.out.println("Масив " + (isOrdered ? "упорядкований." : "не упорядкований."));
    }
}

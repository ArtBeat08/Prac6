import java.util.Random;

public class Calculation {
    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();

        System.out.println("Згенерований масив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }


        int evenCount = 0, oddCount = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("\nКількість парних чисел: " + evenCount);
        System.out.println("Кількість непарних чисел: " + oddCount);
    }
}


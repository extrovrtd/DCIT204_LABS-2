import java.util.Scanner;


public class PairSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Step 2: Create and fill the array
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Step 3: Get the target sum
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();

        // Step 4: Brute force nested-loop search for a matching pair
        boolean found = false;

        for (int i = 0; i < numbers.length && !found; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.println("\n--- Match Found ---");
                    System.out.println("Index " + i + " (value " + numbers[i] +
                            ") + Index " + j + " (value " + numbers[j] + ")");
                    System.out.println(numbers[i] + " + " + numbers[j] + " = " + target);
                    found = true;
                    break;
                }
            }
        }

        // Step 5: Handle the case where no pair is found
        if (!found) {
            System.out.println("\nNo pair of elements in the array sums to " + target + ".");
        }

        scanner.close();
    }
}

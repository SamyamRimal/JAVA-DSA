import java.util.Scanner;

public class BubbleSortExample {

    // Method to perform Bubble Sort
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // Tracks if a swap was made
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap adjacent elements if they are in the wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // Print the array after each pass to track progress
            System.out.println("Pass " + (i + 1) + ": " + arrayToString(array));
            if (!swapped) break; // Stop if the array is already sorted
        }
    }

    // Converts array to a readable string
    public static String arrayToString(int[] array) {
        StringBuilder result = new StringBuilder();
        for (int num : array) {
            result.append(num).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array input from the user
        System.out.print("Enter number of elements: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Original array: " + arrayToString(array));

        // Sort the array using Bubble Sort
        bubbleSort(array);

        System.out.println("Sorted array: " + arrayToString(array));

        scanner.close();
    }
}

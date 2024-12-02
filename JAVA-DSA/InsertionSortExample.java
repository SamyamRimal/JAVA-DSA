import java.util.Scanner;

public class InsertionSortExample {

    // Method to perform Insertion Sort
    public static void insertionSort(int[] array) {
        int n = array.length;

        // Iterate through each element in the array
        for (int i = 1; i < n; i++) {
            int key = array[i]; // The element to be placed in the sorted part
            int j = i - 1;

            // Move elements that are greater than key to one position ahead
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            // Place the key in its correct position
            array[j + 1] = key;

            // Print the array after each pass (for learning purposes)
            System.out.println("Pass " + i + ": " + arrayToString(array));
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

        // Sort the array using Insertion Sort
        insertionSort(array);

        System.out.println("Sorted array: " + arrayToString(array));

        scanner.close();
    }
}


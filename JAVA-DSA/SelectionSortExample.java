import java.util.Scanner;

public class SelectionSortExample {

    // Method to perform Selection Sort
    public static void selectionSort(int[] array) {
        int n = array.length;

        // Outer loop to iterate over the array
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the first unsorted element is the smallest

            // Inner loop to find the index of the smallest element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j; // Update the index of the smallest element
                }
            }

            // Swap the smallest element with the first element of the unsorted part
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }

            // Print the array after each pass (for learning purposes)
            System.out.println("Pass " + (i + 1) + ": " + arrayToString(array));
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

        // Sort the array using Selection Sort
        selectionSort(array);

        System.out.println("Sorted array: " + arrayToString(array));

        scanner.close();
    }
}


import java.util.Scanner;

public class RecursionExamples {

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int sumArray(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }
        return arr[n - 1] + sumArray(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a recursion example:");
        System.out.println("1. Factorial of a number");
        System.out.println("2. Nth Fibonacci number");
        System.out.println("3. Sum of elements in an array");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter a number to find its factorial:");
                int num = scanner.nextInt();
                System.out.println("Factorial of " + num + " is: " + factorial(num));
                break;

            case 2:
                System.out.println("Enter the position (N) to find the Nth Fibonacci number:");
                int n = scanner.nextInt();
                System.out.println("The " + n + "th Fibonacci number is: " + fibonacci(n));
                break;

            case 3:
                System.out.println("Enter the number of elements in the array:");
                int size = scanner.nextInt();
                int[] arr = new int[size];
                System.out.println("Enter the elements of the array:");
                for (int i = 0; i < size; i++) {
                    arr[i] = scanner.nextInt();
                }
                System.out.println("Sum of array elements is: " + sumArray(arr, size));
                break;

            default:
                System.out.println("Invalid choice! Exiting...");
        }

        scanner.close();
    }
}

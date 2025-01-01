import java.util.Scanner;

public class MatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the square matrix (n x n):");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of the matrix row by row:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nOriginal Matrix:");
        displayMatrix(matrix);

        rotateMatrix(matrix);

        System.out.println("\nMatrix after 90-degree rotation:");
        displayMatrix(matrix);

        scanner.close();
    }
}
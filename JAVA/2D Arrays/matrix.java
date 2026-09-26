import java.util.Scanner;
public class matrix{
    public static void main(String arge[]){
        int matrix[][] = new int[3][3];
        int n = matrix.length; // For the number of Rows
        int m = matrix[0].length; // For the number fo Columns
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
             
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        
    }
}
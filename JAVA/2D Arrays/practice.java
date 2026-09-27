public class practice{
    // Find the number of 7's in 2D Array
    public static int findSev(int matrix[][]){
        int count = 0;
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j] == 7){
                    count+=1;
                }
            }
        }
        return count;
    }


    // Print the sum of the numbers in second row
    public static int sumSec(int matrix[][]){
        int sum = 0;
            for(int j = 0; j<matrix.length;j++){
                sum+=matrix[1][j];
            }
        
        return sum;
    }

    //Transpose a Matrix
    public static void transpose(int matrix[][]){
        int row = matrix.length;
        int col = matrix[0].length;

        int transpose[][] = new int[col][row];

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        for(int i = 0; i<transpose.length; i++){
            for(int j = 0; j<transpose[0].length; j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        int matrix[][] = {{4,7,8}, {7,8,7}, {2,2,3}};
        int result = findSev(matrix);
        int res = sumSec(matrix);
        // System.out.print(res);
        transpose(matrix);
    }
}
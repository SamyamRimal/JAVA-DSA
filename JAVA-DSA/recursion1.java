//Write a recursive function to calculate the sum of numbers from 1 to n.
import java.util.Scanner;
public class recursion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        sumNum(n);
    }

    public static int sumNum(int n){
        if(n == 1){
            return 1;
        }
        
        int sum = n + sumNum(n-1);
        System.out.print(sum+" ");
        return sum;
    }
}

//Input 3 numbers. And find average of those numbers.
import java.util.Scanner;
public class PQ1{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();
        int sum = a + b + c;
        int avg = sum/3;
        System.out.println("The average of " + a + ", " + b + ", and " + c + " is: " + avg);
    }
}
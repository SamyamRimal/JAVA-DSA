import java.util.Scanner;

public class sumOfn {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to sum to:");
        int n = sc.nextInt();
        int sum = 0;
        int i = 0;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.print("The sum of number till"+n+"is"+sum);
    }
}
//print sum of first n natural numbers.
import java.util.Scanner;
public class ReviseRecurs {
    public static void Natural(int i, int n, int sum){
        if(i>n){
            System.out.print(sum);
            return;
        }
        sum+=i;
        Natural(i+1,n,sum);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
        Natural(1,n,0);
    }
}

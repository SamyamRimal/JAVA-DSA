import java.util.Scanner;

public class MultOfDigits {

    public static int multDigits(int n){
        if(n==0){
            return 1;
        }

        return n % 10 * multDigits(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digits to multiply:");
        int n = sc.nextInt();
        System.out.print("Multiple of digits are:"+multDigits(n));
    }
}

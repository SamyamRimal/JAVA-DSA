import java.util.Scanner;
public class calFactorial {

    public static int calcFactorail(int n){
        if(n==1 || n ==0){
            return 1;
        }
        int fact1 = calcFactorail(n-1);
        int fact = n*fact1;
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n=sc.nextInt();
        int result = calcFactorail(n);
        System.out.println(n+"! ="+result);
    }
}

import java.util.Scanner;
public class RecurPower {
    public static int Power(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int Power1 = Power(x, n-1);
        int Power2 = x*Power1;
        return Power2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int x=sc.nextInt();
        System.out.print("Enter the power of Number:");
        int n=sc.nextInt();        
        int ans = Power(x, n);
        System.out.print(ans);
    }
}

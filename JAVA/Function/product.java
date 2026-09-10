import java.util.Scanner;
public class product {
    
    public static int product(int a, int b){
        int prdct = a * b;
        return prdct;
        
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a");
        int a = sc.nextInt();
        System.out.print("Enter the value of b");
        int b = sc.nextInt();

        int result = product(a,b);
        System.out.print(result);

    }
}
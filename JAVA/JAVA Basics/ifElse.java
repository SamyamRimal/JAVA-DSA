import java.util.Scanner;
public class ifElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        int output = 0;
        if (a>b){
            System.out.println(a+ " is greater than " +b);
            output = a;
        } 
        else {
            System.out.println(b+ " is greater than " +a);
            output = b;
        }

        if (output%2==0){
            System.out.println(output+ " is even number");
        }
        else {
            System.out.println(output+ " is odd number");
        }
    }
}
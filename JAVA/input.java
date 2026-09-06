import java.util.Scanner;
public class input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");


        System.out.print("Enter the value of c: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }
}
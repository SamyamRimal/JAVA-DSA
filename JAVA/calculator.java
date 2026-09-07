import java.util.Scanner;
public class calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of A");
        int a = sc.nextInt();
        System.out.println("Enter the value of B");
        int b = sc.nextInt();
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplicatuon");
        System.out.println("4. Division");
        System.out.println("Enter the desired number for calculation");
        int num = sc.nextInt();

        switch (num){
            case 1: System.out.println("The sum of "+a+" and "+b+" is: "+(a+b));break;
            case 2: System.out.println("The substraction of "+a+" and "+b+" is: "+(a*b));break;
            case 3: System.out.println("The multiplication of "+a+" and "+b+" is: "+(a*b));break;
            case 4: System.out.println("The division of "+a+" and "+b+" is: "+(a/b));break;
            default: System.out.println("Enter a valid number(1-4)");break;
        }
    }
}
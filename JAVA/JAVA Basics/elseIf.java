import java.util.Scanner;
public class elseIf {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        if (a>0){
            System.out.println(a+ " is positive number");
        }
        else if (a<0){
            System.out.println(a+ " is negative number");
        }
        else {
            System.out.println(a+ " is zero");
        }
    }
}
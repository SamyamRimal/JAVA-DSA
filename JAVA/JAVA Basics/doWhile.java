// Display all the numbers enteresd by iser except multiples of 10
import java.util.Scanner;
public class doWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter a numer");
            int n = sc.nextInt();
            if(n%10 == 0){
                continue;
            }
            System.out.print(n);
        }
        while(true);
    }
}

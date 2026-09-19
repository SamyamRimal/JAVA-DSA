import java.util.Scanner;
public class Array{
    public static void main(String[] args){
        int marks[] = new int[50]; // The size of Marks is 50. We cant change the size in run time.
        int numbers[] = {1, 2, 3}; // We dont have to declear the size if we store like this.
        String fruits[] = {"Apple", "Banana", "Mango"};

        System.out.println(fruits[0]);

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        float percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage: "+percentage+"%");

    }
}
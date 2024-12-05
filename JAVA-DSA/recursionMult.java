import java.util.Scanner;

public class recursionMult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Multiple of :");
        int i=sc.nextInt();

        printMult(i, 1, 1);
    }

    public static void printMult(int i, int n, int mult){
        if(n>10){
            mult = i*n;
            System.out.println(mult);
            return;
        }

        mult=i*n;
        System.out.println(mult+ "="+i+"*"+n);
        printMult(i, n+1, mult);
    }
}

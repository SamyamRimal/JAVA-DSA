// WAP to print numbers 1 to 5 using Recursion
public class ReviseRecur {
    public static void Recursion(int n){
        if(n>5){
            return;
        }
        System.out.println(n);
        Recursion(n+1);

    }
    public static void main(String[] args) {
        Recursion(1);
    }
}

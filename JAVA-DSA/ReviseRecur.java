// WAP to print numbers 5 to 1 using Recursion
public class ReviseRecur {
    public static void Recursion(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        Recursion(n-1);

    }
    public static void main(String[] args) {
        Recursion(5);
    }
}

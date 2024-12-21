public class RecurFibo {
    
    public static void Fibo(int a, int b, int n){
        if(n==0){
            return;
        }
        int c = a+b; // Adding the value of a and b
        System.out.print(c); // Print the value of C in every Recursion to print result
        Fibo(b,c,n-1);  // Swapping the value value of b goes to a and c goes to b
    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.print(a);
        System.out.print(b);
        int n =7;
        Fibo(a, b, n-2); // n-2 because 2 values 0 and 1 are already printed
    }
}

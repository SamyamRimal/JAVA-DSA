public class sumRecursion {
    public static void main(String[] args) {
        printSum(1, 5, 0);
    }

    public static void printSum(int i, int n, int sum){
        if(i == n){
            sum+=i;
            System.out.println(sum);
            return; //Unwinding
        }
        sum+=i;
        printSum(i+1, n, sum);
        System.out.println(i+ " "+sum); // Starts poping elements off stack.
    }
}

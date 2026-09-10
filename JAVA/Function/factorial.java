public class factorial {

    public static int factorial(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f *= i;
        }

        return f;
    }

    public static int binCoeff(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n - r);

        return n_fact / (r_fact * nmr_fact);
    }

    public static void main(String[] args) {
        int result = binCoeff(5, 2);
        System.out.print(result);
    }
}
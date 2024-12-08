public class fibo{

    public static void sumFibo(int a,int b, int n){
        if(n == 0){
            return;
        }
        
        int c = a+b;
        System.out.println(c);
        sumFibo(b,c,n-1);
    }
    public static void main(String[] args) {
        int n = 7;
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        sumFibo(a,b,n-2);
        
    }
}
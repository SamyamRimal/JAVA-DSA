public class RecurFacto {

    public static int Facto(int n){
        if(n==0){
            return 1;
        }
        int Facto1 = Facto(n-1); // First all the values are stored in a Stack by calling a function again and again
        int Facto2 = n*Facto1;
        return Facto2;
    }
    public static void main(String[] args) {
        int ans = Facto(5);
        System.out.print(ans);
    }
}

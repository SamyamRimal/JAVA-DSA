public class calPower {
    public static int calcPower(int x , int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }

        int power1 = calcPower(x,n-1);
        int power2=x*power1;
        return power2;
    }
    public static void main(String[] args) {
        int result = calcPower(4,3);
        System.out.println(result);
    }
}

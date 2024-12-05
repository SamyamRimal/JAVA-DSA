public class easyRecursion {
    public static void main(String[] args) {
        sayHi(3);
    }

    public static void sayHi(int count){
        System.out.print("Hi! Samyam"+count);
        if(count<=1){
            return;
        }
        sayHi(count-1);
    }
}

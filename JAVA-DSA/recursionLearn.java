public class recursionLearn {
    public static void recursion(int count){
        System.out.print("Samyam");
        if(count<=3){
            return;
        }
        recursion(count-1);
    }
    public static void main(String[] args) {
        recursion(5);
    }
}

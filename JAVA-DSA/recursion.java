//Write a program to print numbers 5 to 1.
public class recursion {
    public static void main(String[] args) {
        printNum(1); //first it calls the function then recursion occure
        //as function calls function(same,itself)
    }
    public static void printNum(int n){
        if(n == 6){ // Giving a condition to break the recursion(loop)
            return; //This should at before the printing happens as keeping it after will print 0 and then return.
        }
        System.out.println(n); //Printing the number
        printNum(n+1); // helps in creating a loop(recursion) by calling 
        //it self again and again by decreasing the number.
    }
}

import java.util.Scanner;
import java.util.*;
public class string{
    
    public static void printLetter(String name){
        for(int i=0; i<name.length(); i++){
            System.out.println(name.charAt(i));
        }
    }

    public static boolean isPalindrome(String name){
        for(int i=0; i<name.length()/2; i++){
            int n = name.length();
            if(name.charAt(i) != name.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[]){
        String str = "abcd";
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);

        //String Length
        System.out.println(name.length());
        //charAt to find the letters location
        System.out.println(name.charAt(0));
        printLetter(name);
        System.out.println(isPalindrome(name));
    }
}
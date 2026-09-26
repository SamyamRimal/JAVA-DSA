import java.util.Arrays;
import java.util.Collections;
public class inBuiltSort{
    public static void main(String[] args){
        Integer arr[] = {5,4,1,3,2};
        Arrays.sort(arr);
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        Arrays.sort(arr, Collections.reverseOrder()); // The reverse sort only work when Integer is defined not int
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
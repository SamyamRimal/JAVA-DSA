import java.util.Scanner;

public class sortSelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array:");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the number:");
            arr[i] = sc.nextInt();
        }
        System.out.print("Original Array");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        selectionSort(arr);
        printArr(arr);
    }

    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int smallest = i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

            System.out.println("Pass " + (i + 1) + ": " + arrayToString(arr));
        }
        
    }

    public static String arrayToString(int[] arr) {
        StringBuilder result = new StringBuilder();
        for (int i=0; i<arr.length; i++) {
            int num = arr[i];
            result.append(num).append(" ");
            //.append means adding some thing in this line it is adding 
            //num and space through which 1 2 3 are being printed
        }
        return result.toString().trim(); 
        /*StringBuilder cannot printed Straight is should be converted to String
        So we use toString and trim helps in removing unwanted whitespaces*/ 

    }

    public static void printArr(int[] arr){
        System.out.print("Sorted Array:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

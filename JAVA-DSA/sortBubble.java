import java.util.Scanner;
public class sortBubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element is Array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the number:");
            arr[i] = sc.nextInt();
        }
        System.out.print("Original Array:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+",");
        }
        System.err.println("");
        bubbleSort(arr);
        printArr(arr);
    }
    

    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0; j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void printArr(int[] arr){
        System.out.print("Sorted Array:");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+ ",");
        }
    }
}

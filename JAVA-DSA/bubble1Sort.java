import java.util.Scanner;
// To sort the numbers and find the greatest one
public class bubble1Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element in array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter the numbers:");
            arr[i] =sc.nextInt();
        }
        System.out.println("Array the you have entered is:");
        for(int i=0; i<size; i++){
        System.out.print(arr[i]+ " ");
        }
        System.out.println();

        bubbleSort(arr);
        findLargest(arr);
        printArray(arr);
    }

    public static void bubbleSort(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Ascending");
        System.out.println("2. Descending");
        int choice = sc.nextInt();
        int n = arr.length;
    
        switch (choice) {
            case 1: {
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) { // Ensure j + 1 is valid
                        if (arr[j] > arr[j + 1]) { // Ascending order
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
                break;
            }
            case 2: {
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) { // Ensure j + 1 is valid
                        if (arr[j] < arr[j + 1]) { // Descending order
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
                break;
            }
            default:
                System.out.println("--Invalid Option--");
                break;
        }
        sc.close();
    }
    
    

    public static void findLargest(int[] arr){
        int largest = arr[0];
        for(int i=0;i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
            
        }
        System.out.println("Largest number in the array is :"+largest);
    }

    public static void printArray(int[] arr){
        System.out.println("Sorted Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}

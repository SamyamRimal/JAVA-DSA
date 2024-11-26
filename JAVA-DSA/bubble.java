
public class bubble {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        bubbleSort(arr);
        printArray(arr);
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        
        for(int i=0; i<n-1 ; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]<arr[j+1]){  // This single symbole of < / > can change from ascending to decending
                 int temp = arr[j];
                arr[j] = arr [j+1];
                arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArray(int[] arr) {
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();                        
    }
                            
}
public class insertionSort{
    
    public static void insertionSort(int arr[]){
        for(int i = 1; i<arr.length; i++){
            int curr = arr[i];
            int perv = i - 1;
            //Finding the correct position to insert
            while(perv>=0 && arr[perv] > curr){
                arr[perv+1] = arr[perv];
                perv--;
            }
            //Insertion
            arr[perv+1] = curr; 
        }
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main (String[] args){
        int arr[] = {5,4,1,3,2};
        insertionSort(arr);
        printArr(arr);
    }
}
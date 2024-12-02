public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {7,8,4,2,3};
        for(int i=0;i<arr.length;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArr(arr);
    }

    public static void printArr(int[] arr){
        System.out.print("Sorted array:");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}

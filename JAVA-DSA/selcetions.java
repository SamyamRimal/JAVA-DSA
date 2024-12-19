public class selcetions {

    public static void SelectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int small=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[small]>arr[j]){
                    small=j;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i]=temp;
        }
    }
    public static void PrintArr(int[] arr){
        System.out.print("Sorted Array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={7,8,3,2,1};
        SelectionSort(arr);
        PrintArr(arr);
    }
}

public class sortInsertion {
    public static void main(String[] args) {
        int[] arr = {6,9,4,7,5};
        for(int i=1; i<arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current>arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
            System.out.println("Pass " + (i + 1) + ": " + arrayToString(arr));

        }

        printArr(arr);
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
        System.out.print("Sorted Array");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}

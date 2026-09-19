public class binarySearch{
    
    public static int binarySearch(int number[], int key){
        int start = 0, end = number.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            //Comparison
            if(number[mid] == key){
                return mid;
            }
            if(number[mid]<key){//Right
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args){
        int number[] = {1,2,3,4,5,6,7,8,10};
        int key = 10;
        int bin = binarySearch(number,key);

        System.out.print("Key is in "+bin+" index");
    }
}
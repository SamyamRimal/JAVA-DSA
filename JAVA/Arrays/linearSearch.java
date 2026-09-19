public class linearSearch {
    
    public static int search(int number[], int key){
        for(int i = 0; i<=number.length; i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args){
        int number[] = {1,2,3,4,66,54,10,40,22};
        int key = 10;
        int index = search(number, 10);

        if(index == -1){
            System.out.print("Key not found");
        }
        else{
            System.out.print("Key is in "+index+" index");
        }
    }
}
public class hollowRect {
    
    public static void pattern(int row, int col){
        //Outer Loop
        for (int i=1; i<=row, i++){
            for(int j=1; j<=col; j++){
                if(i==1 || i == rows || j ==1 || j == col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        pattern(4,5);
    }
}
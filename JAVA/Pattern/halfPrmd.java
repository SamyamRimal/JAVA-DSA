public class halfPrmd {
    public static void main(String[] args){
        // for(int i=1; i<=4; i++){
        //     for(int j=1; j<=4-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }



    //Inverted Half Pyramid with Numbers
        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=6-i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


    // FLOYD'S Triangle
    int counter = 1;
        for(int i=1; i<=5; i++){
            for(int j=1;j<=i;j++){ 
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
}
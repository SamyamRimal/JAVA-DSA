import java.util.Scanner;
public class incomeTax{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income: ");
        int income = sc.nextInt();

        int tax = 0;
        if (income<=500000){
            tax = 0;
        }
        else if(income<1000000 && income>=500000){
            tax = (int) (income * 0.2);
        }
        else{
            tax= (int) (income * 0.3);
        }
        System.out.println("The Taxed amount is:"+tax);
        float netSal = income - tax;
        System.out.println("The net salary after tax deduxtion is:"+netSal);
    }
}
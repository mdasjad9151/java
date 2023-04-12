import java.util.Scanner;

public class Perfectno {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = num.nextInt();
        int sum =0;

        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum =  sum +i;
            }
        }
        if(sum ==n){
           
            System.out.println("Number is perfect");
        }
        else{
            System.out.println("Number is not perfect");
        }
        num.close();
    }
}
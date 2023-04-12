import java.util.Scanner;

public class Fabio {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = num.nextInt();
        int a1 = 0;
        int a2 = 1;
        int sum =0;

        
            for (int j = 0; j<n; j++){
                sum = a1+a2;
                a1 = a2;
                a2 = sum;
                System.out.println(sum);
            }
            
    
        num.close();
}
}
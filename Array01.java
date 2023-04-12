import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        // Write a Java program to calculate the average value of array elements.
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = num.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the array elemrnt " + (i + 1) + " : ");
            arr[i] = num.nextInt();
        }
        System.out.println("\n\narray elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] +", ");

        }

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }

        int avg = sum / arr.length;

        System.out.println("average " + avg);

        num.close();

    }
}
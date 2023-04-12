import java.util.Scanner;

import java.util.Arrays;


// Write a Java program to find the duplicate values of an array of string values.
public class Array03 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = num.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the array elemrnt " + (i + 1) + " : ");
            arr[i] = num.nextInt();
        }
        System.out.println("\n\narray elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] +", ");
        }
        Arrays.sort(arr);
        System.out.println("\nDublicate Elemnet(s)");
        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                if(arr[i] == arr[j] && i!=j){
                    System.out.println(arr[i]);
                }
            }
        }

        num.close();
    }
}

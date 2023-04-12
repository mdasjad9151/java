import java.util.Scanner;

// Write a Java program to remove a specific element from an array.
public class Array02 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = num.nextInt();
        int x = num.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the array elemrnt " + (i + 1) + " : ");
            arr[i] = num.nextInt();
        }
        System.out.println("\n\narray elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                for (int j = i; j < n - 1; j++) {
                    arr[j] = arr[j + 1];

                }

            }

        }
        System.out.println("\n\narray elements after remove: ");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + ", ");
        }

        num.close();
    }
}

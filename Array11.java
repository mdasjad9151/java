public class Array11 {
    // Write a Java program to find the second largest element in an array.
    public static void sorting(int arr[], int size) {
        int temp;
        for(int i = 0;i<size;i++){
            for(int j =0;j<size;j++){
                temp = arr[j];
            arr[j] = arr[size-j-1];
            arr[size-j-1] = temp;
            }
        }
        System.out.println("Sorted array");
        for(int i =0;i<size;i++){
            System.out.print(arr[i]+ ",");
        }
        System.out.println("\nSecond largest no in this array is: " +arr[size-2]);

        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        sorting(arr,8);
    }
}

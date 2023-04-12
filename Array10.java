public class Array10 {
    // Java Program For Array Rotation
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8,9,10    };
        int size = 10;
        int temp;
        for(int i=0;i<size/2;i++){
           
            temp = arr[i];
            arr[i] = arr[size-i-1];
            arr[size-i-1] = temp;
        }
        for(int i =0;i<size;i++){
            System.out.print(arr[i]+ ", ");
        }
    }
}

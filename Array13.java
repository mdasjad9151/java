public class Array13 {
    // Search non dublicate element in an array.
    public static void main(String[] args) {
        boolean flag = false;
        int arr[] = {1,1,2,2,3,4,3,6,4};
        System.out.println(arr);
        for(int i =0;i<7;i++){
            for(int j = 0;j<7;j++){
                if(i != j && arr[i]==arr[j]){
                    break;
                }
                else{
                    flag = true;
                }
            }

        }
        if(flag){
            System.out.println("present");
        }
        
    }
}

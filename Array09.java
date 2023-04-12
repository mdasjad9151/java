public class Array09 {
    // Java Program to Merge Two Arrays.
    public static void Merge(int arr1[], int arr2[],int size1, int size2) {
        int n = size1+size2;
        int mergearr[] = new int[n];
        int tempsize1 =0, tempsize2 =0;
        for(int i =0; i<n;i++){
            if(i<size1){
                mergearr[i] = arr1[tempsize1];
                tempsize1++;
            }
            else{
                mergearr[i] =arr2[tempsize2];
                tempsize2++;
            }
        }
        for(int i =0;i<n;i++){
            System.out.println(mergearr[i]);
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        int arr2[] = {5,6,7,8};
        Merge(arr1, arr2, 4, 4);
        
    }

    
}

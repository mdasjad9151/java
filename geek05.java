public class geek05 {
    public static int removeDuplicates(int[] nums){
        int i = 0;
        int k = 1;
        while (i < (nums.length - 1)) {
            if (nums[i+1] != nums[i]) {
                nums[k] = nums[i+1];
                k++;
                System.out.println(nums[k]);
            }
            i++;
        }
        return k;
    // ans = n - count;
        // return count/2;
    }
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        int a = removeDuplicates(arr);
        System.out.println(a);

    }
}

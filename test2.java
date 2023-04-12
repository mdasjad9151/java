// import java.lang.Math;

public class test2 {
    public static int sum(int nums[], int target) {
        int n = nums.length;
        int ans = 0;
        int sum;
        int mn = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if(i!=j  && i!=k && j!=k){
                        sum = nums[i] + nums[j] + nums[k];
                        int b = Math.abs(target - sum);
                        if (b < mn) {
                            ans = sum;
                            mn = b;
                        }
                    }
                    
                }

            }

        }

        return ans;

    }

    public static void main(String[] args) {
        int[] num = {-1,2,1,-4};
        int target = 1;
        int a =sum(num, target);
        System.out.println(a);
    }

}
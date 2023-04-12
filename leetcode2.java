import java.lang.Math.*;
public class leetcode2 {
        public static int[] leftRigthDifference(int[] nums) {
            int temp=0;
            int n =  nums.length;
            
            int ans[] = new int[n];
    
            for(int i=0; i<n; i++){
                int lsum=0;
            int  rsum =0;
                for(int j = 0; j<i; j++){
                    lsum =  lsum + nums[j]; 
                }
    
                for(int j = i+1; i<n; i++){
                    rsum = rsum + nums[j];
                }
                temp = lsum - rsum;
    
    
                ans[i] = Math.abs(temp);
            }
    
            return ans;
            
        }
}

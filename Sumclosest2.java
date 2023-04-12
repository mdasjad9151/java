import java.util.Arrays;

public class Sumclosest2 {
    public static int sumclose(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;
        int[] big = new int[n];
        int[] small = new int[n];
        int bcout = 0;
        int scount = 0;
// Calculate sum of three elements.
        int[] temparr = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    temparr[k] = sum;

                }

            }

        }
// Sort sum element array.
        Arrays.sort(temparr);

// Storing greater and smaller no in  different arrays.
        for (int i = 0; i < n; i++) {
            if (temparr[i] > target) {
                big[bcout] = temparr[i];
                bcout++;
            } else {
                small[scount] = temparr[i];
                scount++;
            }
        }
        

      
// finding closer number.
        if (scount == 0) {
            return temparr[0];
        } 
        else if (bcout == 0) {
            return temparr[n - 1];
        } 
        else {
            if (target - big[bcout - 1] >= small[scount - 1] - target) {
                return big[0];

            }

        }
        return small[scount - 1];

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 6, 7, 8, 10 };
        int target = 21;
         int a = sumclose(arr, target);
         System.out.println(a);
    }

}

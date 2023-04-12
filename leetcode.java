public class leetcode {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int x = n + m;
        int arr[] = new int[x];
        int ans = 0;
        if (n > m) {
            int j = 0;
            for (int i = 0; i < n; i++) {
                if (nums1[i] < nums2[j]) {
                    arr[i] = nums1[i];
                } else {
                    arr[i] = nums2[j];
                    j++;
                }
            }
            for (; j < m; j++) {
                arr[n + j] = nums2[j];
            }
        }

        if (n < m) {
            int j = 0;
            for (int i = 0; i < m; i++) {
                if (nums1[i] > nums2[j]) {
                    arr[i] = nums1[i];
                } else {
                    arr[i] = nums2[j];
                    j++;
                }
            }
            for (; j < n; j++) {
                arr[m + j] = nums2[j];
            }
        }

        for (int i = 0; i < x; i++) {
            System.out.println(arr[i]);
        }

        if (x % 2 == 0) {
            Math.round(n / 2);
            int ans1 = (x / 2);
            int ans2 = ans1 + 1;
            ans = (arr[ans1] + arr[ans2]) / 2;
        } else {
            int index = (x + 1) / 2;
            ans = arr[index];
        }

        return ans;
    }

    public static void main(String[] args) {
        int num1[] = { 1, 3 };
        int num2[] = { 2 };

        double ans = findMedianSortedArrays(num1, num2);

        System.out.println(ans);

    }

}

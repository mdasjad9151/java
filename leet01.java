public class leet01 {
    public static int findMin(int[] arr, int l, int h) {
        if (h < l)
            return arr[0];
 
        // If there is only one element left
        if (h == l)
            return arr[l];
 
        // Find mid
        int mid
            // = l + (h - l) / 2;
            = (l + h)/2;
 
        // Check if element (mid+1) is minimum element.
        // Consider the cases like {3, 4, 5, 1, 2}
        if (mid < h && arr[mid + 1] < arr[mid])
            return arr[mid + 1];
 
        // Check if mid itself is minimum element
        if (mid < l && arr[mid] < arr[mid - 1])
            return arr[mid];
 
        // Decide whether we need to go to left half or
        // right half
        if (arr[h] < arr[mid])
            return findMin(arr, l, mid - 1);
        return findMin(arr, mid + 1, h);
        
    }
    public static void main(String[] args) {
        int arr[] = {1,5,7,8,9};
        int n = arr.length;
        int a = findMin(arr, 0, n-1);
        System.out.println(a);
        
    }
}

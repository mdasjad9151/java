// import java.util.Arrays;

// public class SumClosest {
//     public static int sumclose(int[] nums, int target) {
//         int n = nums.length;
//         int sum = 0;
//         int[] temparr = new int[n];
//         for(int i = 0;i<n;i++){
//             for(int j = 0;j<n;j++){
//                 for(int k = 0;k<n;k++){
//                     sum = nums[i]+nums[j]+nums[k];
//                     temparr[k] = sum;   
            
//                 }
            
//             }


//         }
//         Arrays.sort(temparr);
//         // for(int i =0 ;i<n;i++){
//         //     System.out.println(temparr[i]);
//         // }

//         // Search

//         int se = 0;
//         int ee = n-1;
//         int mid = (se + ee)/2; 
//         while( se <= ee ){  
            
//            if ( temparr[mid] < target ){  
//             if (mid < n-1 && target < nums[mid + 1]){
//                 return close(nums[mid],
//                           nums[mid + 1], target);
//             }
                    
//              se = mid + 1;
//             }
             
           
//            else if ( temparr[mid] == target ){  
              
//              return temparr[mid];
//            }
//            else{
//             if (mid > 0 && target > nums[mid - 1])
//                     return close(nums[mid - 1],
//                                   nums[mid], target);
//            }
            
//               ee = mid - 1;  
//            }  
//            mid = (se + ee)/2; 
//            return nums[mid];
//     } 
       
        
//     public static int close(int val1, int val2,int target) {
//         if (target - val1 >= val2 - target)
//             return val2;       
//         else
//             return val1;
        
//     }
        
    
//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 4, 5, 6, 6, 8, 9 };
//         int target = 11;
//         System.out.println(sumclose(arr, target));
        
//     }
// }

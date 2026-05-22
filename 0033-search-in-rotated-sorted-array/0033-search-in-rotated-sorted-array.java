class Solution {
    public int search(int[] nums, int target) {
        int s = 0;
        int e=nums.length-1;
        
        while(s<=e){
            int mid =(s+e)/2;
            if(nums[mid]==target){
                return mid;

            }
            if(nums[mid]>=nums[s]){
              
              if(target<=nums[mid]&&target>=nums[s]){
               e = mid-1;
              }else{
               s= mid+1;
              }
            }else{
                    if(target>=nums[mid]&&target<=nums[e]){
                        s= mid+1;
                    }else{
                        e= mid-1;
                    }
            }
        }
       return -1;
    }
}

// class Solution {
//     public int search(int[] nums, int target) {
//         int start = 0, end = nums.length - 1;

//         while (start <= end) {
//             int mid = (start + end) / 2;

//             if (nums[mid] == target)
//                 return mid;

//             if (nums[start] <= nums[mid]) {
//                 if (nums[start] <= target && target < nums[mid])
//                     end = mid - 1;
//                 else
//                     start = mid + 1;
//             } else {
//                 if (nums[mid] < target && target <= nums[end])
//                     start = mid + 1;
//                 else
//                     end = mid - 1;
//             }
//         }
//         return -1;
//     }
// }
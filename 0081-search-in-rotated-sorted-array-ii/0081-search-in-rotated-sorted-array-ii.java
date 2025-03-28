class Solution {
    public boolean search(int[] nums, int target) {
        
        int l =0;
        int r =nums.length-1;
        while(l<=r){
         int mid = l+(r-l)/2;
         if(target==nums[mid]){
            return true;
         }
          else if (nums[l] == nums[mid] && nums[mid] == nums[r]) {
                l++;
                r--;
                continue;
            }
         else if(nums[l]<=nums[mid])
         {
            if(nums[mid]<target&&nums[l]<target){
                 l= mid+1;
            }else{
                r= mid-1;
               
                   
            }
           
         }else{
           if(nums[mid]<target&&nums[r]>target){
             l= mid+1;
            }else{
                r= mid-1;
               
                   
            }
         }
        }
    return false;
    }
}
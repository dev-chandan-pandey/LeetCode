class Solution {
    public boolean search(int[] nums, int target) {
        int l=0;
        int r= nums.length-1;
        while(l<=r){
        int mid = l+(r-l)/2;
        if(nums[mid]==target){
            return true;
        }else if (nums[l] == nums[mid] && nums[mid] == nums[r]) {
                l++;
                r--;
                continue;
            }
       else if(nums[l]<=nums[mid]){
             if(nums[l]<=target&&nums[mid]>target){
                r= mid-1;
             }else{
                l=mid+1;
             }
        }else{
            if(nums[mid]<target&&target<=nums[r]){
                l= mid+1;
            }else{
                r= mid-1;
            }
        }
        }
    return false;
    }
}
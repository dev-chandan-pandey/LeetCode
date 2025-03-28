class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int l = 0;
        int r =nums.length-1;
        int min =999;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[l]<=nums[mid]){
                 min = Math.min(min,nums[l]);
                 l =mid+1;  
            }else{
                 min = Math.min(min,nums[mid]);
                 r =mid-1;
            }
        }
        return min;
    }
}
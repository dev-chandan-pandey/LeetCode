class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (target == nums[mid]) {
                return true;
            } else if (nums[l] == nums[mid] && nums[mid] == nums[r]) {
                l++;
                r--;
                continue;
            } else if (nums[l] <= nums[mid]) { // Left half is sorted
                if (nums[l] <= target && target < nums[mid]) {
                    r = mid - 1; // Target is in the sorted left half
                } else {
                    l = mid + 1; // Target is in the unsorted right half
                }
            } else { // Right half is sorted
                if (nums[mid] < target && target <= nums[r]) {
                    l = mid + 1; // Target is in the sorted right half
                } else {
                    r = mid - 1; // Target is in the unsorted left half
                }
            }
        }
        return false;
    }
}
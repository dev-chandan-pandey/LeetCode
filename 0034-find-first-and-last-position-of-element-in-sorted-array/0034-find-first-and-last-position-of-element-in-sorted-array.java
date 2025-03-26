class Solution {
    private int rightmost(int[] nums, int target, int n) {
        int rightmost = -1;
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2; // Corrected mid calculation
            if (nums[mid] == target) {
                rightmost = mid;
                l = mid + 1; // Corrected to find the rightmost
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return rightmost;
    }

    private int leftmost(int[] nums, int target, int n) {
        int l = 0;
        int r = n - 1;
        int leftmost = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2; // Corrected mid calculation
            if (nums[mid] == target) {
                leftmost = mid;
                r = mid - 1;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return leftmost;
    }

    public int[] searchRange(int[] nums, int target) {
        int left = leftmost(nums, target, nums.length);
        int right = rightmost(nums, target, nums.length);
        return new int[] { left, right }; // Corrected array creation
    }
}
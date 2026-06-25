class Solution {
    public static int firstPosition(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int first = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                first = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }
    public static int lastPosition(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int last = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                last = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
           return last;
    }
    public int[] searchRange(int[] nums, int target) {
        int firstPoint = firstPosition(nums, target);
        int secondPoint = lastPosition(nums, target);
        int[] arr = new int[] {firstPoint, secondPoint};
        return arr;
    }
}

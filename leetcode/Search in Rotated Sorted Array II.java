class Solution {
    public boolean search(int[] nums, int target) {

        //idea: split array into two arrays after finding the pivot, then apply binary search

        int pivot = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                pivot = i - 1;
                break;
            }
        }

        if (pivot == -1) {
            if (Arrays.binarySearch(nums, target) > -1)
                return true;

            return false;
        }


        int[] left = new int[pivot + 1];
        int[] right = new int[nums.length - pivot];

        int l = 0;
        int r = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i <= pivot) {
                left[l] = nums[i];
                l++;
            } else {
                right[r] = nums[i];
                r++;
            }
        }


        if (Arrays.binarySearch(left, target) > -1 || Arrays.binarySearch(right, target) > -1)
            return true;

        return false;

    }
}

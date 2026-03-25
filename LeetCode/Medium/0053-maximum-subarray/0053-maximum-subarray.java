class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int curr_max = nums[0];
        int n = nums.length;
        for(int i = 1; i < n; i++)
        {
            curr_max = Math.max(curr_max + nums[i], nums[i]);
            max = Math.max(curr_max, max);
        }
        return max;
    }
}
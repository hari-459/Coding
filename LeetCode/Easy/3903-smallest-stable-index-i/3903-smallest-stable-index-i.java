class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max,min;
        for(int i = 0; i < nums.length; i++)
        {
            max = nums[i];
            for(int j = 0; j < i; j++)
            {
                max = (nums[j] > max) ? nums[j] : max;
            }
            min = nums[i];
            for(int l = i; l < nums.length; l++)
            {
                min = (nums[l] < min) ? nums[l] : min;
            }
            if(max - min <= k) return i;
        }
        return -1;
    }
}
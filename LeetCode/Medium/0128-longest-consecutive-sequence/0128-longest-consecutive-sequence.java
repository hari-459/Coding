class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> num = new HashSet<>();
        for(int i = 0; i < nums.length; i++)
        {
            num.add(nums[i]);
        }
        int maxStreak = 0;
        for(int i : num)
        {
            int cur = 0;
            int currStreak = 0;
            if(!num.contains(i - 1))
            {
                cur = i;
                currStreak = 1;
                while(num.contains(cur + 1))
                {
                    cur += 1;
                    currStreak += 1;
                }
                maxStreak = Math.max(maxStreak, currStreak);
            }
        }
        return maxStreak;
    }
}
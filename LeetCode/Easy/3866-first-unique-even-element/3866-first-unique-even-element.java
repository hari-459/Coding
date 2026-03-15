class Solution {
    public int firstUniqueEven(int[] nums) {
        int[] map = new int[101];

        for(int num : nums)
        {
            map[num]++;
        }
        
        for(int num : nums)
        {
            if(num % 2 == 0 && map[num] == 1){
                return num;
            }
        }
        return -1;
    }
}
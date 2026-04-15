class Solution {
    public int check(int n, int d)
    {
        int c = 0, t;
        while(n > 0)
        {
            t = n%10;
            if(t == d) c++;
            n = n/10;
        }
        return c;
    }
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        for(int i : nums)
        {
            count += check(i, digit);
        }
        return count;
    }
}
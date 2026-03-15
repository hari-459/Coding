class Solution {
    public int gcd(int a, int b)
    {
        if(a == 0) return b;
        while(b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int max = 1;
        int n = nums.length;
        int[] prefixGcd = new int[n];
        for(int i =0; i < n; i++)
        {
            if(max < nums[i]) max = nums[i];
            prefixGcd[i] = gcd(nums[i],max);
        }
        Arrays.sort(prefixGcd);

        int left = 0, right = n - 1;
        long sum = 0;
        while(left < right)
        {
            sum += gcd(prefixGcd[left],prefixGcd[right]);
            left++;
            right--;
        }
        return sum;
    }
}
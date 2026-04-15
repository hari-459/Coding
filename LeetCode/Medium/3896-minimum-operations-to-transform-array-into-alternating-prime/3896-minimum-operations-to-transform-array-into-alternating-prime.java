class Solution {
    public boolean isPrime(int n)
    {
        if(n == 1 || n== 0) return false;

        for(int i = 2; i <= Math.sqrt(n); i++)
        {
            if(n % i == 0) return false;
        }
        return true;
    }
    public int minOperations(int[] nums) {
        int op = 0;
        for(int i = 0; i < nums.length; i++)
        {
            int n = nums[i];
            if(i % 2 == 0)
            {
                while(!isPrime(n))
                {
                    n++;
                    op++;
                }
            }
            else{
                while(isPrime(n))
                {
                    n++;
                    op++;
                }
            }
        }
        return op;
    }
}
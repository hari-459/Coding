class Solution {
    public int dominantIndices(int[] nums) {
        int c=0,i=0,j=0;
        int n=nums.length;
        for(i=0;i<n-1;i++)
        {
            int sum=0,k=0;
            for(j=i+1;j<n;j++)
            {
                sum+=nums[j];
                k++;
            }
            int avg=sum/k;
            if(nums[i]>avg)
                c++;
        }
        return c;
    }
}
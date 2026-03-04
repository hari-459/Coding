class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        int[] res={-1,-1};
        int[] freq=new int[101];
        for(int i:nums)
        {
            freq[i]++;
        }
        for(int i=1;i<=100;i++)
        {
            if(freq[i]==0) continue;
            for(int j=i+1;j<=100;j++)
            {
                if(freq[j]==0) continue;
                if(freq[i]!=freq[j])
                {
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
            }
        }
        return res;
    }
}
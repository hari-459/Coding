class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int[] t=new int[n+1];
        int[] res=new int[2];
        for(int i=0;i<n;i++)
        {
            t[nums[i]]++;
        }
        for(int i=1;i<=n;i++)
        {
            if(t[i]>1) res[0]=i;
            if(t[i]==0) res[1]=i;
        }
        return res;
    }
}

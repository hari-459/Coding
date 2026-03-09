class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int n=capacity.length;
        int f=0;
        List<Integer> list = new ArrayList<>();
        for(int i:capacity)
        {
            list.add(i);
        }
        int small=101;
        for(int i=0;i<n;i++)
        {
            if(capacity[i]>=itemSize)
            {
                if(small>capacity[i]) small=capacity[i];
                f=1;
            }
        }
        if(f==0) return -1;
        return list.indexOf(small);
    }
}
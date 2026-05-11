class Solution {
    public int[] separateDigits(int[] nums) {
        List res = new ArrayList<>();
        for(int i : nums)
        {
            int t = 0;
            List arr1 = new ArrayList<>();
            while(i != 0)
            {
                t = i % 10;
                arr1.add(t);
                i /= 10;
            }
            for(int j = arr1.size() - 1; j >= 0;j--)
            {
                res.add(arr1.get(j));
            }
        }
        int[] arr = new int[res.size()];
        for(int i = 0; i < res.size(); i++)
        {
            arr[i] = (int)res.get(i);
        }
        return arr;
    }
}
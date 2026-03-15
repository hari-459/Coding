class Solution {
    public long countCommas(long n) {
        long count = 0;

        long val = 1000;

        while(n >= val)
        {
            count += (n-val+1);

            if(val > Long.MAX_VALUE/1000) break;
            val *= 1000;
        }
        return count;
    }
}
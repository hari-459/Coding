class Solution {
    public static int fact(int n)
    {
        if(n==0 || n==1) return 1;
        return n*fact((n-1));
    }
    public static boolean permutation(int a,int b)
    {
        if (String.valueOf(a).length() != String.valueOf(b).length())
            return false;

        int[] count = new int[10];

        while (a > 0) {
            count[a % 10]++;
            a /= 10;
        }

        while (b > 0) {
            count[b % 10]--;
            b /= 10;
        }

        for (int i = 0; i < 10; i++) {
            if (count[i] != 0)
                return false;
        }

        return true;
    }
    public boolean isDigitorialPermutation(int n){
        int sum=0,t;
        int org=n;
        while(n!=0)
            {
                t=n%10;
                sum+=fact(t);
                n/=10;
            }
        return permutation(org,sum);
    }
}
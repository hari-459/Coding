class Solution {
    public int scoreDifference(int[] nums) {
        int i=0;
        int p1=0,p2=0,active=1;
        for(int s : nums){
            if(s%2==0 && (i+1)%6==0)
            {
                if(active==1)
                {
                    p2+=s;
                    active=0;
                }
                else{
                    p1+=s;
                    active=1;
                }
            }
            else if(s%2!=0 && (i+1)%6==0)
            {
                if(active==1) p1+=s;
                else p2+=s;
            }
            else if(s%2!=0){
                if(active==1)
                {
                    p2+=s;
                    active=0;
                }
                else{
                    p1+=s;
                    active=1;
                }
            }
            else{
                if(active==1)
                {
                    p1+=s;
                }
                else{
                    p2+=s;
                }
            }
            i++;
        }
        System.out.println(p1+" "+p2);
        return p1-p2;
    }
}
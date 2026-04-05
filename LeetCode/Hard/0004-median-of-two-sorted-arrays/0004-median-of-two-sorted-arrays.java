class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n3 = n1 + n2;
        int k = 0;
        int[] nums3 = new int[n3];
        for(int i = 0; i < n1; i++)
        {
            nums3[k++] = nums1[i];
        }
        for(int i = 0; i < n2; i++)
        {
            nums3[k++] = nums2[i];
        }
        Arrays.sort(nums3);
        for(int i : nums3)
        System.out.println(i);
        if(n3 % 2 == 0)
        {
            double val =(double) (nums3[n3/2-1] + nums3[n3/2])/2;
            return val;
        }
        else{
            return nums3[n3/2];
        }
    }
}
class Solution {
    public String reverseOnlyLetters(String s) {
        int i = 0, j = s.length() - 1;
        char[] arr = s.toCharArray();
        while(i < j)
        {
            if(!Character.isLetter(arr[i]))
            {
                i++;
            }
            else if(!Character.isLetter(arr[j]))
            {
                j--;
            }
            else{
                char t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
                j--;
            }
        }
        String ans = new String(arr);
        return ans;
    }
}
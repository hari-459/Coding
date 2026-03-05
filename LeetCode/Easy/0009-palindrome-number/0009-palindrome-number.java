class Solution {
    public boolean isPalindrome(int x) {
        String number=String.valueOf(x);
        StringBuilder s=new StringBuilder(number);
        String rev=s.reverse().toString();
        if(number.equals(rev)) return true;
        return false;
    }
}
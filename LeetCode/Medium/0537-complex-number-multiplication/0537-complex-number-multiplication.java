class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String[] s1=num1.split("\\+");
        String[] s2=num2.split("\\+");

        int a=Integer.parseInt(s1[0]);
        int c=Integer.parseInt(s2[0]);
        int b=Integer.parseInt(s1[1].replace("i",""));
        int d=Integer.parseInt(s2[1].replace("i",""));

        int real=(a*c)-(b*d);
        int imag=(a*d)+(b*c);
        String out=real+"+"+imag+"i";
        return out;
    }
}
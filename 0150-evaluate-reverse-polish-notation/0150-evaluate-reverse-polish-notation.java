class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String s:tokens)
        {
            if(s.equals("+"))
            {
                stack.push(stack.pop()+stack.pop());
            }
            else if(s.equals("*"))
            {
                stack.push(stack.pop()*stack.pop());
            }
            else if(s.equals("-"))
            {
                int first=stack.pop();
                int sec=stack.pop();
                stack.push(sec-first);
            }
            else if(s.equals("/"))
            {
                int first=stack.pop();
                int sec=stack.pop();
                stack.push(sec/first);
            }
            else stack.push(Integer.parseInt(s));
        }
        return stack.peek();
    }
}
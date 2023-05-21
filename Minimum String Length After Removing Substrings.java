class Solution {
    public int minLength(String s) {
        int l =s.length();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<l;i++)
        {
           char c= s.charAt(i);
            if(stack.size()==0)
            {
                stack.push(c);
            }
            else
            {
            char t= stack.peek();
            if(c=='B' || c=='D')
            {
                 if(c=='B')
                 {
                       if(t=='A')
                            stack.pop();
                       else
                           stack.push(c);
                  }
                else
                {
                  if(t=='C')
                      stack.pop();
                else
                     stack.push(c);
                }
            }
            else
                stack.push(c);
            }
            
            
        }
        return stack.size();
    }
}

class Solution {
    public String makeSmallestPalindrome(String s) {
        int l=s.length();
        char a[]= new char[l];
        for(int i=0;i<l;i++)
              a[i]=s.charAt(i);
        
        
        int mid= l/2;
        int last= l-1;
        for(int i=0;i<mid;i++)
        {
         if(s.charAt(i)==s.charAt(last))
         {
           a[i]=s.charAt(i);
             a[last]=s.charAt(last);
             
         }
         else
         {
             if(s.charAt(i) < s.charAt(last))
                {
                 a[i]=s.charAt(i);
                 a[last]=s.charAt(i);
                }
             else
             {
                  a[i]=s.charAt(last);
                 a[last]=s.charAt(last);
                    
             }
         }
            last--; 
        }
        String ans="";
        for(int i=0;i<l;i++)
        {
      ans = ans + a[i]+"";
        }
        return ans;
    }
}

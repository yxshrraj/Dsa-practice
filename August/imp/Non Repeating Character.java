class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        HashMap<Character,Integer> mp =new HashMap<Character,Integer>();
        char x ='$';
        for(int i=0 ;i<S.length();i++)
        {
            char c= S.charAt(i);
            if(mp.containsKey(c))
            {
               mp.put(c, mp.getOrDefault(c, 0) + 1);
 
            }
            else
            {
                mp.put(c,1);
            }
        }
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (mp.get(c) == 1) {  // Check if count is 1
                x = c;
                break;
            }
        }
        return x;
    }
}
------------------------------------------------------------------------------------------------------------------------------------------------------------------------
optimal :
class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        char x='$';
        char [] ans= new  char[26];
        for(int i=0 ;i<S.length();i++)
        {
            char c= S.charAt(i);
            ans[c-'a']++;
        }
        for(int i=0 ;i<S.length();i++)
        {
            char c=S.charAt(i);
            if(ans[c-'a']==1)
             return c;
        }
        return '$';
    }
    
}
  

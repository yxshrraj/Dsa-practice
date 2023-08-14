TC- O(nlogn)
  -------------------------
  

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        
        return Arrays.equals(sChars, tChars);
    }
}
----------------------------------------------------------------
  TC- O(

class Solution {
    public boolean isAnagram(String s, String t) {
        int m = s.length();
        int n =t.length();
        if(m!=n)
        {
            return false;
        }
        int [] ans = new int[26];
        for(int i=0 ;i<m ;i++)
        {
            ans[s.charAt(i)-'a']++;
        }
        for(int i=0 ;i<n ;i++)
        {
            ans[t.charAt(i)-'a']--;
        }
        for(int i=0 ;i<ans.length;i++)
        {
            if(ans[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
}
------------------------------------------

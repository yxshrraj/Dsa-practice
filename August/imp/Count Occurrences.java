import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String s =sc.next();
        HashMap<Character , Integer> mp = new HashMap<Character,Integer>();
         int n= s.length();
         for(int i=0 ;i<n ;i++)
         {
             char c =s.charAt(i);
             if(mp.containsKey(c))
             {
                 mp.put(c,mp.get(c)+1);
             }
             else
             {
                 mp.put(c,1);
                }
         }
         for(int i=0 ;i<n ;i++)
          {
               if (mp.get(s.charAt(i)) != 0)
              {
                  System.out.print( s.charAt(i)) ;
                  System.out.print(mp.get(s.charAt(i))+ " " );
                  mp.put(s.charAt(i),0);
              }
          }
    }
}

class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    static class Pair{
        int start,end; 
        Pair(int start,int end)
        {
            this.start= start;
            this.end=end;
        }
    }
    public static int maxMeetings(int start[], int end[], int n)
    {
       ArrayList<Pair> list = new ArrayList<>();
       
       for(int i=0 ; i<n ;i++)
       {
           list.add(new Pair(start[i],end[i]));
       }
       Collections.sort(list,(a,b)->(a.end-b.end));
       
       int ans=1;
       int prev=0;
       for(int i=1 ; i<n ;i++)
       {
           if(list.get(i).start>list.get(prev).end)
           {
               ans++;
               prev=i;
           }
       }
       return ans;
    }
}

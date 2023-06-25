class Solution {
     int mod = 1000000007;
   int calc(int []locations, int start ,int finish ,int fuel, int [][]dp)
   {
       if(fuel<0) return 0;
        if(dp[start][fuel]!=-1) return dp[start][fuel]; 
         int ans= 0;
         if(start==finish) ans++;
         
         for(int i=0 ;i<locations.length;i++)
         {
             if(i==start || Math.abs(locations[i]-locations[start]) >fuel)  continue;
             
              ans+= calc(locations, i,finish,fuel-Math.abs(locations[i]-locations[start]),dp);
            ans=ans%mod;

             
         } 
         return dp[start][fuel] =ans % mod;   
   }


    public int countRoutes(int[] locations, int start, int finish, int fuel) {
        int n= locations.length;
        int [][] dp = new int[n][fuel+1];
       for(int row[]:dp)
       {
         Arrays.fill(row,-1);
       }

        return   calc(locations , start, finish ,fuel ,dp);


    }
}

LEETCODE :
class Solution {
    public void dfs(int node,ArrayList<ArrayList<Integer>> adj,boolean vis[] )
    {
        vis[node]=true;
        for(Integer it: adj.get(node))
        {
            if(vis[it]==false)
            {
                vis[it]=true;
                dfs(it,adj,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
         int V= isConnected.length;
         ArrayList<ArrayList<Integer>> adj= new ArrayList<ArrayList<Integer>>();
         for(int i=0; i<=V;i++)
         {
             adj.add(new ArrayList<Integer>());
         }
         for(int i=0;i<V;i++)
         {
             for(int j=0;j<V;j++)
             {
                 if(isConnected[i][j]==1 && i!=j)
                 {
                     adj.get(i).add(j);
                     adj.get(j).add(i);
                 }
             }
         }
         boolean vis[] =new boolean[V+1];
         int cnt=0;
         for(int i=0; i<V;i++)
         {
             if(vis[i]==false)
             {
                 cnt++;
                 dfs(i,adj,vis);
             }
         }
         return cnt;
    }
}
____________________________________________________________________________________________________________________________________________________________________________
GFG wla
    
class Solution {
    static void dfs(int node, ArrayList<ArrayList<Integer>> list,boolean vis[])
    {
        vis[node]=true;
        for(Integer it : list.get(node))
        {
            if(vis[it]==false)
            {
                vis[it]=true;
                dfs(it,list,vis);
            }
        }
    }
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        ArrayList<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
        for(int i=0 ;i<V;i++)
        {
            list.add(new ArrayList<Integer>());
        }
        for(int i=0; i<V; i++)
        {
            for(int j=0; j<V;j++)
            {
                if(adj.get(i).get(j)==1 && i!=j)
                {
                    list.get(i).add(j);
                    list.get(j).add(i);
                }
            }
        }
        boolean vis[]= new boolean [V];
        int cnt=0;
        for(int i=0 ;i<V;i++)
        {
            if(vis[i]==false)
            {
                cnt++;
                dfs(i,list,vis);
            }
        }
        return cnt;
    }
};

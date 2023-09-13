class Solution {
    // Function to return a list containing the DFS traversal of the graph.
     public void dfs(int node, boolean vis[] , ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> list )
     {
         vis[node]=true;
         list.add(node);
         
         for(Integer it :adj.get(node))
         {
             if(vis[it]==false)
             {
                 vis[it]=true;
                 dfs(it,vis,adj,list);
             }
         }
     }
    
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> list = new ArrayList<>();
        boolean vis[] =new boolean[V];
        // vis[0]=true;
        dfs(0,vis,adj,list);
        
        return list;
    }
}

class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
         ArrayList<Integer> list= new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean vis [] = new boolean[V+1];
        q.offer(0);
        vis[0]=true;
        while(!q.isEmpty())
        {
            Integer node= q.poll();
            list.add(node);
            for(Integer it : adj.get(node))
            {
                
                if(vis[it]==false)
                {
                    vis[it]=true;
                    q.offer(it);
                }
            }
        }
        return list;
    }
}

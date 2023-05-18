/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Tuple{
     TreeNode node;
     int row;
     int col;

     public Tuple(TreeNode _node, int _row, int _col){
         node = _node;
         row = _row;
         col = _col;
     }
 }
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        // TreeMap to store nodes sorted by x and y coordinates
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();

        // Queue to store nodes for BFS traversal
        Queue<Tuple> q = new LinkedList<Tuple>();

        // Add root node to queue with x and y coordinates both as 0
        q.add(new Tuple(root, 0, 0));

        // Traverse the tree using BFS
        while (!q.isEmpty()) {

            // Get the next node from the queue
            Tuple tuple = q.poll();
            TreeNode node = tuple.node;
            int x = tuple.row;
            int y = tuple.col;

            // If x-coordinate is not already in TreeMap, add it
            if (!map.containsKey(x)) {
                map.put(x, new TreeMap<>());
            }

            // If y-coordinate is not already in TreeMap, add it
            if (!map.get(x).containsKey(y)) {
                map.get(x).put(y, new PriorityQueue<>());
            }

            // Add node's value to the PriorityQueue at (x, y)
            map.get(x).get(y).offer(node.val);

            // Add left child to queue with x-1 and y+1 coordinates
            if (node.left != null) {
                q.offer(new Tuple(node.left, x - 1, y + 1));
            }

            // Add right child to queue with x+1 and y+1 coordinates
            if (node.right != null) {
                q.offer(new Tuple(node.right, x + 1, y + 1));
            }
        }

        // Traverse the TreeMap and add values to the list
        List<List<Integer>> list = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> ys : map.values()) {
            list.add(new ArrayList<>());
            for (PriorityQueue<Integer> node: ys.values()) {
                while (!node.isEmpty()) {
                    list.get(list.size() - 1).add(node.poll());
                }
            }
        }

        // Return the final list
        return list;
    }
}

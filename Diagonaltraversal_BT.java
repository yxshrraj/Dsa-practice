 public void preorder(Node root, HashMap<Integer, ArrayList<Integer>> hm, int level) {
        if (root == null) return;
        
        ArrayList<Integer> list = hm.getOrDefault(level, new ArrayList<>());
        list.add(root.data);
        hm.put(level, list);
        
        preorder(root.left, hm, level + 1);
        preorder(root.right, hm, level);
    }
    
    public ArrayList<Integer> diagonal(Node root) {
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        preorder(root, hm, 0);
        
        ArrayList<Integer> res = new ArrayList<>();
        
        for (int level : hm.keySet()) {
            res.addAll(hm.get(level));
        }
        
        return res;
    }

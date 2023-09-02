class MyStack {
         Queue<Integer> q1;
         Queue<Integer> q2;
    public MyStack() {
        q1= new LinkedList<>();
       q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        q2.offer(x);
        while(!q1.isEmpty())
        {
            q2.offer(q1.remove());
         
        }
        while(!q2.isEmpty())
        {
            q1.offer(q2.remove());
            
        }
    }
    
    public int pop() {
        int z= q1.remove();
        return z;

    }
    
    public int top() {
        int y= q1.peek();
        return y;
    }
    
    public boolean empty() {
        if(q1.isEmpty() && q2.isEmpty())
            {
                return true;
            }
            return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

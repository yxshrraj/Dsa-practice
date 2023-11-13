class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    boolean knows(int a , int b,int M[][],int n)
    {
        if(M[a][b]==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    int celebrity(int M[][], int n)
    {
    	// code here 
    	Stack <Integer> st = new Stack<>();
    	
    	for(int i=0; i<n;i++)
    	{
    	    st.push(i);
    	}
    	while(st.size()>1)
    	{
    	    int a= st.peek();
    	    st.pop();
    	    
    	    int b=st.peek();
    	    st.pop();
    	   if(knows(a,b,M,n))
    	   {
    	      st.push(b);
    	   }
    	   else
    	   {
    	       st.push(a);
    	   }
    	}
    	int ans= st.peek();
    	int rowcnt=0;
    	for(int i=0;i<n;i++)
    	{
    	    if(M[ans][i]==0)
    	      rowcnt++;
    	}
    	if(rowcnt!=n)
    	{
    	    return -1;
    	}
    	
    	int onecnt=0;
    	for(int i=0;i<n;i++)
    	 {
    	     if(M[i][ans]==1)
    	     {
    	         onecnt++;
    	     }
    	 }
    	 if(onecnt!=n-1)
    	 {
    	     return -1;
    	 }
    	 return ans;
    }
}

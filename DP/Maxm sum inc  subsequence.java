recursive: 
class Solution
{
    int func(int ind , int prev, int arr[] ,int n)
    {
        if(ind==n) return 0;
        
        int nottake= 0+ func(ind+1 ,prev,arr,n);
        int take=0;
        
        if(prev==-1 || arr[ind]>arr[prev])
        {
            take=arr[ind]+ func(ind+1,ind,arr,n);
            
        }
        return Math.max(take,nottake);
    }
	public int maxSumIS(int arr[], int n)  
	{  
	    return func(0,-1,arr,n);
	}  
}

memoized :
class Solution
{
    int func(int ind , int prev, int arr[] ,int n)
    {
        if(ind==n) return 0;
        
        int nottake= 0+ func(ind+1 ,prev,arr,n);
        int take=0;
        
        if(prev==-1 || arr[ind]>arr[prev])
        {
            take=arr[ind]+ func(ind+1,ind,arr,n);
            
        }
        return Math.max(take,nottake);
    }
	public int maxSumIS(int arr[], int n)  
	{  
	    return func(0,-1,arr,n);
	}  
}

Tabulation :

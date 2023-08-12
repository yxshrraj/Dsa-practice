class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        int max=0;
        for(int i=0 ;i<n;i++)
        {
            int sum=0;
            for(int j=i ; j<n;j++)
            {
                
                sum+=arr[j];
                
                if(sum==0)
                {
                    max=Math.max(max,j-i+1);
                }
            }
        }
        return max;
        
        
    }
}
---------------------------------------------------------------------------------------------------------------------------
optimal: 
lass GfG
{
    int maxLen(int A[], int n)
    {
        // Your code here
        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();

        int maxi = 0;
        int sum = 0; 

        for(int i = 0;i<n;i++) {

            sum += A[i]; 

            if(sum == 0) {
                maxi = i + 1; 
            }
            else {
                if(mpp.containsKey(sum)) {

                    maxi = Math.max(maxi, i - mpp.get(sum)); 
                }
                else {

                    mpp.put(sum, i); 
                }
            }
        }
        return maxi; 
    }
}



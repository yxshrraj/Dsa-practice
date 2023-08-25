class Solution
{
    public static void sort012(int a[], int n)
    {
         int c1=0 ;
         int c2=0;
         int c3=0;
        
         for(int i=0; i<n ;i++)
         {
             if(a[i]==0) c1++;
             else if(a[i]==1) c2++;
              else  c3++;
         }
         for(int i=0 ;i<c1;i++)
         {
             a[i]= 0;
         }
         for(int i=c1; i<c1+c2;i++)
         {
             a[i]=1;
         }
         for(int i=c1+c2; i<n;i++)
         {
             a[i]=2;
         }
    }
    
}
------------------------------------------------------------------------------------------------------------------------------------------
    Optimal :
class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here
        int mid=0 ;
        int low=0;
        int high= n-1;
        while(mid<=high)
        {
            if(a[mid]==0)
            {
                int temp = a[mid];
                a[mid]=a[low];
                a[low]=temp;
                low++;
                mid++;
            }
            else if(a[mid]==1) mid++;
            
            else
            {
                int temp = a[mid];
                a[mid]=a[high];
                a[high]=temp;
                high--;
            }
        }
    }
}

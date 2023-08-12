class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int a[], int n, int k) {
        //Complete the function
        // int maxi =0;
        // for(int i=0;i<N;i++)
        // {
        //     int sum=0;
        //     for(int j=i; j<N ;j++)
        //     {
        //         sum+=A[j];
        //         if(sum==K)
        //         {
        //             maxi= Math.max(maxi,j-i+1);
        //         }
        //     }
        // }
        // return maxi;
        

        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            //calculate the prefix sum till index i:
            sum += a[i];

            // if the sum = k, update the maxLen:
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // calculate the sum of remaining part i.e. x-k:
            int rem = sum - k;

            //Calculate the length and update maxLen:
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            //Finally, update the map checking the conditions:
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
     
        }
    
    
    
}

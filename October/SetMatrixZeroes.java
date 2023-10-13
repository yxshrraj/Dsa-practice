BRUTE FORCE :
  __________________________________________________________________________________________________

class Solution {
    public void markrow(int i ,int [][]matrix)
    {
        int m=matrix[0].length;
        for(int j=0 ;j<m;j++)
        {
            if(matrix[i][j]!=0)
            {
                matrix[i][j]=-1;
            }
        }
    }

     public void markcol(int j ,int [][]matrix)
    {
        int n=matrix.length;
        for(int i=0 ;i<n;i++)
        {
            if(matrix[i][j]!=0)
            {
                matrix[i][j]=-1;
            }
        }
    }
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m= matrix[0].length;

        for(int i=0; i<n; i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    markrow(i,matrix);
                    markcol(j,matrix);
                }
            }
        }
        for(int i=0 ;i<n; i++)
        {
            for(int j=0 ;j<m ;j++)
            {
                if(matrix[i][j]==-1)
                {
                    matrix[i][j]=0;
                }
            }
        }
    }
}

__________________________________________________________________________________________________________________________
BETTER:
  class Solution {
    public void setZeroes(int[][] matrix) {
        int n= matrix.length;
        int m=matrix[0].length;
        int row [] =new int[n];
        int col[] =new int[m];
        for(int i=0; i<n;i++)
        {
            for(int j=0; j<m;j++)
            {
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0 ;i<n; i++)
        {
            for(int j=0; j<m;j++)
            {
                if(row[i]==1 || col[j]==1)
                {
                    matrix[i][j]=0;
                }
            }
        }
    }
}
  

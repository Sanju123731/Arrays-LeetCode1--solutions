class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        if(mat==null || mat.length==0)
        return new int[]{-1,0};
        int n=mat.length;
        int m=mat[0].length; int low=0;
        int high=m-1;  int maxOnes=0;int index=0;
        if(m==0)
            {
            return new int[]{0,0};
        }
         for(int i=0;i<n;i++)
         { 
            int count=0;
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==1)
                {
                    count++;
                }
            }
            if(count>maxOnes)
            {
                maxOnes=count;
                index=i;
            }
         }
         return new int []{index,maxOnes};
    }
}
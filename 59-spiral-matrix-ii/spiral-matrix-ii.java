class Solution {
    public int[][] generateMatrix(int n) {
         
         int [][]matrix=new int[n][n];
        int topRow=0;
         int leftColumn=0;
        int bottomRow=n-1;
        int rightColumn=n-1;
        int current=1;
       
        while(current<=n*n)
        {
            // calculate toprow
            for(int i=leftColumn;i<=rightColumn && current<=n*n;i++)
            {
              matrix[topRow][i]=current;
                current++;
            }
            topRow++;

            // calculate rightcolumn
            for(int j=topRow;j<=bottomRow && current<=n*n;j++)
            {
              matrix[j][rightColumn]=current;
                current++;
            }
            rightColumn--;
            // bottomRow
             for(int i=rightColumn;i>=leftColumn && current<=n*n;i--)
            {
               matrix[bottomRow][i]=current;
                current++;
            }
            bottomRow--;
             // leftcolumn
             for(int i=bottomRow;i>=topRow && current<=n*n;i--)
            {
              matrix[i][leftColumn]=current;
                current++;
            }
            leftColumn++;
        }
        return matrix;

    }
}
    

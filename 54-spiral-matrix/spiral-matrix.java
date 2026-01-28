class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>  result=new ArrayList<>();
        int rows=matrix.length;
        int cols=matrix[0].length;
        int topRow=0;
         int leftColumn=0;
        int bottomRow=rows-1;
        int rightColumn=cols-1;
        int current=1;
        int total=rows*cols;
        while(current<=total)
        {
            // calculate toprow
            for(int i=leftColumn;i<=rightColumn && current<=total;i++)
            {
               result.add (matrix[topRow][i]);
                current++;
            }
            topRow++;

            // calculate rightcolumn
            for(int j=topRow;j<=bottomRow && current<=total;j++)
            {
                result.add (matrix[j][rightColumn]);
                current++;
            }
            rightColumn--;
            // bottomRow
             for(int i=rightColumn;i>=leftColumn && current<=total;i--)
            {
                result.add (matrix[bottomRow][i]);
                current++;
            }
            bottomRow--;
             // leftcolumn
             for(int i=bottomRow;i>=topRow && current<=total;i--)
            {
                result.add (matrix[i][leftColumn]);
                current++;
            }
            leftColumn++;
        }
        return result;

    }
}
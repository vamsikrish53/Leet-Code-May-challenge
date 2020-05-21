// https://leetcode.com/problems/count-square-submatrices-with-all-ones/

class Solution {
    public int countSquares(int[][] matrix) {
        int mat[][] = new int[matrix.length + 1][matrix[0].length + 1];
        int sum = 0;
        
        /*  We can do Dynamic Programming by saving how many
            Squares can be formed using the bottom right corner
            element.
        */
        
        for(int i = 1; i <= matrix.length; i++)
            for(int j = 1; j <= matrix[0].length; j++)
                if(matrix[i - 1][j - 1] != 0)
                    sum += (mat[i][j] = Math.min(Math.min(mat[i - 1][j], mat[i][j - 1]), mat[i - 1][j - 1]) + 1);
        
                
        /*
        Workin on the first example:
        ===========================
        Matrix =
        [0,1,1,1],
        [1,1,1,1],
        [0,1,1,1]
        ===========================
        mat after algorithm = 
        [0,0,0,0,0],
        [0,0,1,1,1],
        [0,1,1,2,2],
        [0,0,1,2,3]
        ===========================
        After summing all indicies, now we get the correct answer!
        */
                
        return sum;
    }
}

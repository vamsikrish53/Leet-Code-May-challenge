// https://leetcode.com/problems/uncrossed-lines/

class Solution {
    public int maxUncrossedLines(int[] A, int[] B) {
        int m = A.length, n = B.length;
        /*
        initiating two dimensional matrix contains(hypothetically) A[] along the row and
        B[] along the column
        */
        int[][] dp = new int[m+1][n+1];
        for(int i = 1;i < m+1;i++) {
            for(int j = 1; j < n+1;j++) {
                /*
                Here we have to check only three cell of two dimentionsal matrix
                
                1. current cell : let we choose to connect the current A[i-1] and 
                B[j-1] then maximum connecting line we can get : 1 + dp[i-1][j-1]
                
                2. if we don't want the curent element of B(ie..B[j-1]) then maximum we   
                can get is dp[i][j-1]
                
                3. if we don't want the current element of A(ie.. A[i-1]) then maximum we 
                can get is dp[i-1][j]
                
                4. Now dp[i][j] = Math(step1, Math.max(step2, step3));
                */
                int x = (A[i-1] == B[j-1])? 1 : 0;
                dp[i][j] = Math.max(x+dp[i-1][j-1], Math.max(dp[i][j-1], dp[i-1][j]));
            }
        }
        return dp[m][n];
    }
}

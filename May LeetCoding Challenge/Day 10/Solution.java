// https://leetcode.com/problems/find-the-town-judge/

class Solution {
    public int findJudge(int N, int[][] trustArr) {
        int[] trust = new int[N];
        for(int[] p : trustArr) {
            trust[p[0]-1]--;
            trust[p[1]-1]++;
        }
        
        for(int i=0; i<trust.length; i++)
            if(trust[i] == N-1)
                return i+1;

        return -1;
    }
}

// https://leetcode.com/problems/check-if-it-is-a-straight-line/

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        float slope = getSlope(coordinates[0], coordinates[1]);
        for(int i=2; i < coordinates.length; i++) {
            float m = getSlope(coordinates[i], coordinates[0]);
            if(m != slope)
                return false;
        }
        return true;
    }
    
    public float getSlope(int[] p1, int[] p2) {
        if(p1[0]-p2[0] == 0)
            return 40000;
        return (float)(p2[1]-p1[1])/(p2[0] - p1[0]);
    }
}

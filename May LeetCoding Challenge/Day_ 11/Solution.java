// https://leetcode.com/problems/flood-fill/

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor)
            return image;
        floodFiller(image,sr,sc,newColor,image[sr][sc]);
        return image;
    }
    
    public void floodFiller(int[][] image, int r, int c, int newColor, int oldColor) {
        if(r < 0 || c < 0 || r >= image.length || c >= image[0].length || oldColor != image[r][c])
            return;
        
        image[r][c] = newColor;
        floodFiller(image,r+1,c,newColor,oldColor);
        floodFiller(image,r-1,c,newColor,oldColor);
        floodFiller(image,r,c+1,newColor,oldColor);
        floodFiller(image,r,c-1,newColor,oldColor);
    }
}

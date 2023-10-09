class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int sample = image[sr][sc];
        
        if (sample != color) {
            change(image, sr, sc, color, sample);
        }
        return image;
    }
    
    public void change(int[][] image, int sr, int sc, int color, int sample) {
        if (image[sr][sc] == sample) {
            image[sr][sc] = color;
            if (sr-1 >= 0) change(image, sr-1, sc, color, sample);
            if (sc-1 >= 0) change(image, sr, sc-1, color, sample);
            if (sr+1 < image.length) change(image, sr+1, sc, color, sample);
            if (sc+1 < image[sr].length) change(image, sr, sc+1, color, sample);
        }
    } 
}
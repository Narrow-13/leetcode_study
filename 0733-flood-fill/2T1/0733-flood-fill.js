var floodFill = function(image, sr, sc, color) {
    if(image[sr][sc] == color) return image;
    fill(image, sr, sc, color, image[sr][sc]);
    return image;
}

var fill = function(image, sr, sc, color, old) {
    if(sr >= 0 && sc >= 0 && sr < image.length && sc < image[sr].length && old == image[sr][sc]){
        image[sr][sc] = color;

        fill(image, sr-1, sc, color, old);
        fill(image, sr+1, sc, color, old);
        fill(image, sr, sc-1, color, old);
        fill(image, sr, sc+1, color, old);
    }
};
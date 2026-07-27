class Solution {
    public int maxArea(int[] heights) {
        int first_bar=0;
        int second_bar=0;
        int max_water = 0;
        for(int i=0; i<heights.length; i++){
            for(int j=i+1; j<heights.length; j++){
                first_bar=Math.max(first_bar, heights[i]);
                second_bar=heights[j];

                int water = Math.min(first_bar, second_bar)*(j-i);
                max_water=Math.max(max_water, water);
            }
        }return max_water;
    }
}

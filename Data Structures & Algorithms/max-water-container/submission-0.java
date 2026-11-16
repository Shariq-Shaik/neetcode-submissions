class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int start = 0;
        int end = heights.length-1;
        for(int i = 0;i<heights.length;i++){
            int len=Math.min(heights[start],heights[end]);
            int wid = end-start;
            int val = len*wid;
            max = Math.max(max,val);
            if(heights[start]<heights[end]){
                start++;
            }else{
                end--;
            }
        }
        return max;
    }
}

class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int l = 0;
        int r = height.length-1;
        while (l<r){
            int hei = Math.min(height[l],height[r]);
            int dif = r-l;
            int area = hei*dif;
            maxArea = Math.max(maxArea,area);
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxArea;
    }
}
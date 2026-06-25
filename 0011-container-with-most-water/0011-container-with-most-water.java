class Solution {
    public int maxArea(int[] height) {
        int a = 0;
        int b = height.length-1;
        int max = 0;
        while(a<b){
            int mul = 0;
            if(height[a]>=height[b]){
                mul = height[b] * (b-a);
                b--;
            }
            else{
                mul = height[a] * (b-a);
                a++;
            }
            if(max<mul){
                max = mul;
            }
        }
        return max;
    }
}
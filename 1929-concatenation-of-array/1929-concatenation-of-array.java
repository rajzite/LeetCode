class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int start = 0;
        int[] ans = new int[n*2];
        while(start<nums.length){
            ans[start] = nums[start];
            ans[n] = nums[start];
            start++;
            n++;
        }
        return ans;
    }
}
class Solution {
    public int minMoves(int[] nums) {
        int count = 0;
        int maxNum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            maxNum = Math.max(maxNum,nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            count += maxNum-nums[i];
        }
        return count;
    }
}
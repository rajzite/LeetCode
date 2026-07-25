class Solution {
    public int findGCD(int[] nums) {
        int maxNum = nums[0];
        int minNum = nums[0];
        for (int i=1;i<nums.length;i++){
            maxNum = Math.max(maxNum,nums[i]);
            minNum = Math.min(minNum,nums[i]);
        }
        int divisor = 1;
        int ans = divisor;
        while (divisor<=minNum){
            if(maxNum%divisor == 0 && minNum%divisor==0){
                ans = divisor;
            }
            divisor++;
        }
        return ans;
    }
}
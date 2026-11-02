class Solution {
    public int minMoves2(int[] nums) {
        int count = 0;
        for (int i=0;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[j]<nums[i]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        int mid = nums[nums.length/2];
        int j=0;
        while (j != nums.length){
            if (nums[j]<mid){
                count += mid-nums[j];
            } else if (nums[j]>mid) {
                count += nums[j]-mid;
            }
            j++;
        }
        return count;
    }
}
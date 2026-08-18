class Solution {
    public int largestInteger(int[] nums, int k) {
        if (nums.length == k){
            int max = -1;
            for (int num : nums){
                max = Math.max(max,num);
            }
            return max;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<k;i++){
            if (map.containsKey(nums[i])){
                map.replace(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int left = 1;
        int right = k;
        while(right<nums.length){
            for (int i=left;i<=right;i++){
                if (map.containsKey(nums[i])){
                    map.replace(nums[i],map.get(nums[i])+1);
                }else{
                    map.put(nums[i],1);
                }
            }
            left++;
            right++;
        }

        int ans = -1;
        for (int i=0;i<nums.length;i++){
            if (map.get(nums[i]) == 1 ){
                ans = Math.max(ans,nums[i]);
            }
        }
        return ans;
    }
}
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int size = Math.abs(nums.length/3);
        int i=0;
        while (i<nums.length){
            int count = 0;
            if(map.containsKey(nums[i])){
                count = map.get(nums[i]);
                map.put(nums[i],count+1);
            }else{
                map.put(nums[i],1);
            }
            if(count>=size && !list.contains(nums[i])){
                list.add(nums[i]);
            }
            i++;
        }
        return list;
    }
}
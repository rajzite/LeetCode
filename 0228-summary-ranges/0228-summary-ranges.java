class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if(nums.length == 0) return list;
        int start = nums[0];
        int temp = start;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == temp+1){
                temp = nums[i];
            }else{
                if(start != temp){
                    list.add(start+"->"+temp);
                }else{
                    list.add(""+start);
                }
                start = nums[i];
                temp = start;
            }
        }
        if(!list.contains(start)){
            if(start != temp){
                list.add(start+"->"+temp);
            }else{
                list.add(""+start);
            }
        }
        return list;
    }
}
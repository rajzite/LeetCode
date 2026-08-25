class Solution {
    public int missingMultiple(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            list.add(num);
        }
        int i = 1;
        while (true){
            int mul = k * i;
            if(!list.contains(mul)){
                return mul;
            }
            i++;
        }
    }
}
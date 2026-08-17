class Solution {
    public int maximumLengthSubstring(String s) {
        if(s.isEmpty()) return 0;

        int count = 1;
        int left = 0;
        int right = 1;
        Map<Character,Integer> map = new HashMap<>();
        map.put(s.charAt(left),1);
        while(right<s.length()){
            char c = s.charAt(right);
            if(!map.containsKey(c)){
                map.put(c,1);
                right++;
            }else{
                if(map.get(c)==2){
                    count = Math.max(count,right-left);
                    char l = s.charAt(left);
                    map.replace(l,map.get(l)-1);
                    left++;
                }else{
                    map.replace(c,map.get(c)+1);
                    right++;
                }
            }
            count = Math.max(count,right-left);

        }
        return count;
    }
}
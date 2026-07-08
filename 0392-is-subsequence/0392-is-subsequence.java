class Solution {
    public boolean isSubsequence(String s, String t) {
        int prev = 0;
        for(int i=0;i<s.length();i++){
            int j=prev;
            boolean condition = false;
            while(j<t.length()){
                if(s.charAt(i) == t.charAt(j)){
                    prev = j+1;
                    condition = true;
                    break;
                }
                j++;
            }
            if(condition == false){
                return false;
            }
        }
        return true;
    }
}
class Solution {
    public String digitSum(String s, int k) {
        while(s.length()>k){
            StringBuilder str = new StringBuilder();
            int start = 0;
            while (start<s.length()){
                int sum = 0;
                for (int i=0;i<k;i++){
                    if (start==s.length()){
                        break;
                    }
                    sum += s.charAt(start)-'0';
                    start++;
                }
                str.append(sum);
            }
            s = str.toString();
        }
        return s;
    }
}
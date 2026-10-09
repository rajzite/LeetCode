class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        int count = 0;
        int start = s.length();
        int end = 0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='('){
                count++;
            }else if (s.charAt(i)==')') {
                count--;
            }

            if (count>=1){
                start = Math.min(start,i);
                end = Math.max(end,i);
            }

            if (count == 0){
                str.append(s.substring(start+1,end+1));
                start = s.length();
                end = 0;
            }
        }
        return str.toString();
    }
}
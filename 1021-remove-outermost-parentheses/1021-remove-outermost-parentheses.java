class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='(' && stack.isEmpty()){
                stack.push(s.charAt(i));
            }else if (s.charAt(i)=='(' && !stack.isEmpty()){
                str.append(s.charAt(i));
                stack.push(s.charAt(i));
            } else if (s.charAt(i)==')') {
                stack.pop();
                if (!stack.isEmpty()){
                    str.append(s.charAt(i));
                }
            }
        }
        return str.toString();
    }
}
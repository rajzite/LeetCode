class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int halfLen = n/2;

        char[] c = s.substring(0,halfLen).toCharArray();
        Arrays.sort(c);
        StringBuilder str = new StringBuilder();
        str.append(c);

        if(n%2!=0){
            str.append(s.charAt(halfLen));
        }
        
        for (int i=halfLen-1;i>=0;i--){
            str.append(c[i]);
        }
        return str.toString();
    }
}
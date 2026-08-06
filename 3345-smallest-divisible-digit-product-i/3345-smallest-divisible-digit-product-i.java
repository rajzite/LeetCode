class Solution {
    public int smallestNumber(int n, int t) {
        int product = 1;
        int temp = n;
        while(temp>0){
            int num = temp%10;
            product *= num;
            temp /=10;
        }
        if (product%t == 0){
            return n;
        }
        return smallestNumber(n+1,t);
    }
}
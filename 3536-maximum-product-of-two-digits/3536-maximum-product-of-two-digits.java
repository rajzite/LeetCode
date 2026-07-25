class Solution {
    public int maxProduct(int n) {
        int maxProduct = Integer.MIN_VALUE;
        int maxNum = -1;
        while (n>0){
            int num = n%10;
            maxProduct = Math.max(maxProduct,maxNum * num);
            maxNum = Math.max(maxNum,num);
            n /= 10;
        }

        return maxProduct;
    }
}
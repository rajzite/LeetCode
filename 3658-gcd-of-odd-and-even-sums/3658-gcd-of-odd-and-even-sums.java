class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;
        int oddCount = 0;
        int evenCount = 0;
        int num = 1;
        while(oddCount <n || evenCount<n){
            if(num%2==0){
                sumEven += num;
                evenCount++;
            }else{
                sumOdd += num;
                oddCount++;
            }
            num++;
        }
        return Math.abs(sumEven-sumOdd);
    }
}
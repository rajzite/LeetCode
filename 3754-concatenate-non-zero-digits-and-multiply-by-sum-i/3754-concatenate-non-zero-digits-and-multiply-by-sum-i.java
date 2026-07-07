class Solution {
    public long sumAndMultiply(int n) {
        long revNum = 0;
        long sum = 0;
        int count = 0;
        int repNum = n%10;
        boolean repCondition = true;
        while (n!=0){
            int temp = n%10;
            if (temp != revNum) {
                repCondition = false;
            }
            if(temp!=0){
                sum+=temp;
                revNum = revNum*10;
                revNum += temp;
                count++;
            }
            n = n/10;
        }
        if(repNum*count == sum && repCondition){
            return revNum*sum;
        }

        long num = 0;
        while (revNum!=0){
            long temp = revNum%10;
            num*=10;
            num+=temp;
            revNum /= 10;
        }
        long ans = num*sum;
        return ans;
    }
}
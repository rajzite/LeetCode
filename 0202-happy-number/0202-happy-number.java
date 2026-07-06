class Solution {
    public boolean isHappy(int n) {
        List<Integer> list = new ArrayList<>();
        while(n!=1){
            int sum = 0;
            while(n!=0){
                int temp = n%10;
                n /= 10;
                sum+=temp*temp;
            }
            n = sum;
            if(!list.contains(n)){
                if(n==1){
                    return true;
                }else if(n==0){
                    return false;
                }
                list.add(n);
            }else{
                return false;
            }
        }
        return true;
    }
}
class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<digits.length;i++){
            int j= 0;
            int temp = digits[i];
            while (j<digits.length){
                if(j != i) {
                    temp *= 10;
                    temp += digits[j];
                    int k = 0;
                    while (k < digits.length) {
                        if (k != i && k != j) {
                            temp *= 10;
                            temp += digits[k];
                            if (temp > 99 && temp < 1000 && temp % 2 == 0) {
                                set.add(temp);
                            }
                            temp /= 10;
                        }
                        k++;
                    }
                    temp /= 10;
                }
               j++;
            }
        }
        return set.size();
    }
}
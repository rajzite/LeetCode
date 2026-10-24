class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int count = 0;

        int arrAliMonth = Integer.parseInt(arriveAlice.substring(0,2));
        int arrAliDate = Integer.parseInt(arriveAlice.substring(3,5));

        int leaAliMonth = Integer.parseInt(leaveAlice.substring(0,2));
        int leaAliDate = Integer.parseInt(leaveAlice.substring(3,5));

        int arrBobMonth = Integer.parseInt(arriveBob.substring(0,2));
        int arrBobDate = Integer.parseInt(arriveBob.substring(3,5));

        int leaBobMonth = Integer.parseInt(leaveBob.substring(0,2));
        int leaBobDate = Integer.parseInt(leaveBob.substring(3,5));

        int arrMonth = 0;
        int arriveDate = 0;
        int leaveMonth = 0;
        int leaveDate = 0;
        if (arrBobMonth>arrAliMonth){
            arrMonth = arrBobMonth;
            arriveDate = arrBobDate;
        }else if (arrBobMonth<arrAliMonth){
            arrMonth = arrAliMonth;
            arriveDate = arrAliDate;
        }else{
            arrMonth = Math.max(arrAliMonth,arrBobMonth);
            arriveDate = Math.max(arrAliDate,arrBobDate);
        }

        if (leaAliMonth<leaBobMonth){
            leaveMonth = leaAliMonth;
            leaveDate = leaAliDate;
        }else if(leaAliMonth>leaBobMonth){
            leaveMonth = leaBobMonth;
            leaveDate = leaBobDate;
        }else{
            leaveDate = Math.min(leaAliDate,leaBobDate);
            leaveMonth = Math.min(leaAliMonth,leaBobMonth);
        }

        if (leaveMonth<arrMonth){
            return 0;
        }else if (leaveMonth<=arrMonth && leaveDate<arriveDate){
            return 0;
        }else {
            if (arrMonth==leaveMonth) {
                count = leaveDate - arriveDate;
            }
           else{
               while (arrMonth!=leaveMonth){
                   int temp = days[arrMonth-1] - arriveDate;
                   arriveDate = 0;
                   count += temp;
                   arrMonth++;
               }
               count += leaveDate;
            }
        }

        return count+1;
    }
}
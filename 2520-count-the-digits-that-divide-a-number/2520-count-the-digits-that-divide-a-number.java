class Solution {
    public int countDigits(int num) {
        int val = num;
        int count = 0;
        while(val!=0){
            int digit = val % 10;
            if(num % digit == 0){
                count++;
            }
            val/=10;
        }
       
        return count;
    }
}
class Solution {

    public String removeDigit(String number, char digit) {
        String ans = "";
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                String temp = number.substring(0, i) + number.substring(i + 1);
                if(temp.compareTo(ans)>0){
                    ans = temp;
                }
            }
        }
        
        return ans;
    }
}

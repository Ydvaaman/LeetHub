class Solution {
    public int minimumChairs(String s) {
        int max = 0;
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='E'){
                count++;
                max = Math.max(max,count);
            }else{
                count--;
            }
        }
        return max;
    }
}
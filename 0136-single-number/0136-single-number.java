class Solution {
    public int singleNumber(int[] nums) {
        int uniqueNo = 0;
        for(int val : nums){
            uniqueNo = uniqueNo ^ val;
        }
        return uniqueNo;
        
    }
}
class Solution {
    public int missingNumber(int[] nums) {
        int xorarr = 0;
        for(int i:nums){
            xorarr^=i;
        }
        int xorAll = 0;
        for(int i=0;i<=nums.length;i++){
            xorAll^=i;
        }
        return xorarr^xorAll;
        
    }
}
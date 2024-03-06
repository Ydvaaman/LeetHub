class Solution {
    public int countPairs(int[] nums, int k) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j] && (i*j)%k==0 && 0<=i && i<j && j<nums.length){
                    count++;
                }
            }
        }
        return count;
    }
}
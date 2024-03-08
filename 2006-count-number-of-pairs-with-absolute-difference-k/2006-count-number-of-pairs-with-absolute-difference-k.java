class Solution {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                int x= Math.abs(nums[i]-nums[j]);
                if(i<j && x==k){
                    count++;
                }
            }
        }
        return count;
    }
}
class Solution {
    public int unequalTriplets(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(0<=i && i<j && j<k && k<n && nums[i] != nums[j] && nums[i]!=nums[k] && nums[j]!=nums[k]){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
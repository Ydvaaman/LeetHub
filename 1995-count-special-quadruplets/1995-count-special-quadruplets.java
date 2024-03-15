class Solution {
    public int countQuadruplets(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int l =k+1;l<n;l++){
                        if(i<j && j<k && k<l && nums[i] + nums[j] + nums[k] == nums[l]){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
                    int cnt = 0;
            for(int j=0;j<nums.length;j++){
                if(j!=i && nums[i] > nums[j]){
                    cnt++;
                }
            }
           ans[k] = cnt;
            k++;
        }
        return ans;
    }
}
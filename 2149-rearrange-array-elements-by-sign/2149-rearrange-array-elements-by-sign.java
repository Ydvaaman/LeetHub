class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int pi = 0, ni = 1;
        int [] ans = new int[n];
        for(int ele: nums){
            if(ele >= 0){
                ans[pi] = ele;
                pi+= 2;
            }else{
                ans[ni] = ele;
                ni+= 2;
            }
        }
        return ans;
    }
}
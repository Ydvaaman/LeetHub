class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int pro = 1;
        for(int i=0;i<nums.length;i++){
            pro = nums[i];
            for(int j=i;j<nums.length;j++){
                if(i!=j) pro *= nums[j];
                if(pro > max){
                    max = pro;
                }
            }
            pro = 1;
        }
        return max;
    }
}
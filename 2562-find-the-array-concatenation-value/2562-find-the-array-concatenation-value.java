class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long sum=0,n=nums.length/2+nums.length%2;
        for(int i=0;i<n;i++){
            if(i==nums.length-i-1){
                sum+=nums[i];
            }else{
                
                sum+=Long.valueOf(String.valueOf(nums[i]).concat(String.valueOf(nums[nums.length-i-1])));
            }
        }
        return sum;
        
    }
}
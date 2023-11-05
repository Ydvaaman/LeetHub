class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            
            if(i > 0 && nums[i]==nums[i-1]) continue;
            int start = i+1;
            int last = n-1;
            while(start<last){
                int sum = nums[i]+nums[start]+nums[last];
                if(sum==0){
                    list.add(Arrays.asList(nums[i],nums[start],nums[last]));
                    start++;
                    last--;
                    while(start < last && nums[start]==nums[start-1])start++;
                    while(start < last && nums[last]==nums[last+1])last--;
                }else if(sum < 0){
                    start++;
                }else{
                    last--;
                }
            }
            
        }
        return list;
    }
}
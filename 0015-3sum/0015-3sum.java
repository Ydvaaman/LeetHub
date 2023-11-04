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
                    List<Integer>res = new ArrayList<>();
                    res.add(nums[i]);
                    res.add(nums[start]);
                    res.add(nums[last]);
                    list.add(res);
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
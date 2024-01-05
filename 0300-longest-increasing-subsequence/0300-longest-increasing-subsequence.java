class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        int len = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] > list.get(list.size()-1)){
                list.add(nums[i]);
                len++;
            }else{
                int ind = Collections.binarySearch(list,nums[i]);
                
                if(ind < 0){
                    ind = -ind -1;
                }
                list.set(ind,nums[i]);
            }
        }
        return len;
        
    }
}
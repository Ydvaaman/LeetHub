class Solution {
    public boolean containsDuplicate(int[] nums) {
       Set<Integer> intSet = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(intSet.contains(nums[i])) return true;
            intSet.add(nums[i]);
        }
        return false;
        
    }
}

 // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++){
        //         if(nums[i]==nums[i+1])return true;
        // }
        // return false;
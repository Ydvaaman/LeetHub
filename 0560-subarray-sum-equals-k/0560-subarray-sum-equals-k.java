class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int result = 0;
        int cumSum = 0;
        map.put(0,1);
        
        for(int i=0;i<nums.length;i++){
            cumSum+=nums[i];
            if(map.containsKey(cumSum-k)){
                result+=map.get(cumSum-k);
            }
            map.put(cumSum,map.getOrDefault(cumSum,0)+1);
        }
        return result;
    }
}
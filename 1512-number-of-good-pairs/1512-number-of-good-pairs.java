class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(Integer num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Integer val : map.values()){
            count+= val * (val-1)/2;
        }
        return count;
    }

}
class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int v:map.keySet()){
            if(map.get(v)>1){
                return v;
            }
        }
        return -1;
    }
}
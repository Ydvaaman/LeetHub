class Solution {
    public int findFinalValue(int[] nums, int original) {
        int mul=1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int n:map.keySet()){
            if(map.containsKey(original)){
                original*=2;
                mul=original;
            }else{
                return original;
            }
        }
        return mul;
    }
}
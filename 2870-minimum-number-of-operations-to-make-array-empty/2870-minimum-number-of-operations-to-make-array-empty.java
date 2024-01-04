class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int res = 0;
        for(int val:map.values()){
            if(val==1) return -1;
            res+= val/3;
            if(val%3!=0)res++;
        }
        return res;
    }
}
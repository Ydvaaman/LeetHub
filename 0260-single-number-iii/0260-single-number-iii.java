class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int t=0;
        for(int v:map.keySet()){
            if(map.get(v)==1){
                ans[t]=v;
                t++;
            }
        }
        return ans;
    }
}
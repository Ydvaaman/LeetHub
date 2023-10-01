class Solution {
    public int minOperations(int[] nums) {
     HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int ans = 0;
        for(int i:map.keySet()){
            if(map.get(i)==1){
                return -1;
            }
            int size = map.get(i);
            if(size%3==0){
                ans+=size/3;
            }else{
                ans+=size/3+1;
            }
        }
        return ans;
    }
}
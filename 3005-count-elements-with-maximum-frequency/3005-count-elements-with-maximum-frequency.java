class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
            max=Math.max(max,map.get(n));
        }
        int count = 0;
        for(int v:map.values()){
            if(v==max){
                count+=v;
            }
        }
        return count;
    }
}
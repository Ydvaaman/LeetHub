class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int []arr  = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int t  =0;
        for(int k : map.keySet()){
            if(map.get(k)>=2){
                arr[t] = k;
                t++;
            }
        }
        return arr;
    }
}
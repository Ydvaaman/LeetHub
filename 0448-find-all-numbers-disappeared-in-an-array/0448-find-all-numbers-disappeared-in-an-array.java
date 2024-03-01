class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int i=1;i<=nums.length;i++){
            if(!map.containsKey(i)){
                list.add(i);
            }
        }
        return list;
    }
}
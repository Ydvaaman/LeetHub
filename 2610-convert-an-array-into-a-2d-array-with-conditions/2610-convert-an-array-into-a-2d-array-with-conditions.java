class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int n : nums){
            list.add(n);
        }
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        while(!list.isEmpty()){
            List<Integer> unique = new ArrayList<>();
            
            for(int i=0;i<list.size();i++){
                if(!set.contains(list.get(i))){
                    set.add(list.get(i));
                    unique.add(list.get(i));
                    list.remove(i);
                    i--;
                }
            }
            res.add(unique);
            set.clear();
            
        }
        return res;
    }
}
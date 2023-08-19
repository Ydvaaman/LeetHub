class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        backtrack(resultList, new ArrayList<>(), nums, 0);
        return resultList;
    }
    private void backtrack(List<List<Integer>> resultSets, List<Integer> tempSet, int[] nums, int start){
        resultSets.add(new ArrayList<>(tempSet));
        for(int i=start;i<nums.length;i++){
            tempSet.add(nums[i]);
            backtrack(resultSets, tempSet, nums, i+1);
            tempSet.remove(tempSet.size()-1);
        }
    }
}

// IIterative method
    
//         List<List<Integer>> res = new ArrayList<>(); //power Set
//         res.add(new ArrayList());
        
//         for( int num:nums){
//             int n = res.size();
//             for(int j = 0; j<n; j++){
//                 List<Integer> temp = new ArrayList(res.get(j));
//                 temp.add(num);
//                 res.add(temp);
//             }
//         }
//         return res;
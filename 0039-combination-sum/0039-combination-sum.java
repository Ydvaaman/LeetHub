class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
    
    private void findCombination(int ind, int[] arr, int target, List<List<Integer>> ans,List<Integer> ds){
        if(ind == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        //pick condition where we take the element
        if(arr[ind] <= target){
            ds.add(arr[ind]);
            // in this we reduce the target value by arr index value
            findCombination(ind, arr, target - arr[ind], ans, ds);
    //while doing the backtrack we have to remove the element which have been added ealier
            ds.remove(ds.size() - 1);
        }
        // not pick condition 
        findCombination(ind + 1, arr, target, ans, ds);
    }
}
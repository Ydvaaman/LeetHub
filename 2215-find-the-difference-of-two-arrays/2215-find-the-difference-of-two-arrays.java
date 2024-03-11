class Solution {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int v : nums2) {
            set2.add(v);
        }
        HashSet<Integer> list1 = new HashSet<>();
        HashSet<Integer> list2 = new HashSet<>();
        for(int num : nums1){
            if(!set2.contains(num)){
                list1.add(num);
            }
        }
        for(int num : nums2){
            if(!set1.contains(num)){
                list2.add(num);
            }
        }
        ans.add(new ArrayList(list1));
        ans.add(new ArrayList(list2));
        return ans;
    }
}

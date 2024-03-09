class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int v : nums2) {
            set2.add(v);
        }
        Set<Integer> set = new HashSet<>();
        for (Integer num : set1) {
            if (set2.contains(num)) {
                set.add(num);
            }
        }
        int[] ans = new int[set.size()];
        int idx = 0;
        for (Integer val : set) {
            ans[idx] = val.intValue();
            idx++;
        }
        return ans;
    }
}

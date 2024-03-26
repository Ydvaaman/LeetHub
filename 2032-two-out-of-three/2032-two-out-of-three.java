class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> ans = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();
        for(int n1:nums1){
            set1.add(n1);
        }
        for(int n2:nums2){
            set2.add(n2);
        }
        for(int n3:nums3){
            set3.add(n3);
        }
        for(int v:set1){
            if(set2.contains(v)){
                ans.add(v);
            }else if(set3.contains(v)){
                ans.add(v);
            }
        }
        for(int n:set2){
            if(set3.contains(n)){
                ans.add(n);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:ans){
            list.add(i);
        }
        return list;
    }
}
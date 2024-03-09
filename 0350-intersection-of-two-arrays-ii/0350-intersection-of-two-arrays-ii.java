class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            list.add(nums1[i]);
        }
        ArrayList<Integer> ans = new ArrayList();
        for(int i=0;i<nums2.length;i++){
            if(list.contains(nums2[i])){
                ans.add(nums2[i]);
                list.remove(Integer.valueOf(nums2[i]));
            }
            if(list.size() == 0) break;
        }
        int[] arr = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            arr[i] = ans.get(i);
        }
            return arr;
    }
}
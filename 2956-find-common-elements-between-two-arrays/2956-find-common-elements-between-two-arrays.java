class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(int n1 : nums1){
            map1.put(n1,map1.getOrDefault(n1,0)+1);
        }
        for(int n2: nums2){
            map2.put(n2,map2.getOrDefault(n2,0)+1);
        }
        int count = 0;
        for(int i=0;i<nums1.length;i++){
            if(map2.containsKey(nums1[i])){
                count++;
            }
        }
        int count2 = 0;
         for(int i=0;i<nums2.length;i++){
            if(map1.containsKey(nums2[i])){
                count2++;
            }
        }
        ArrayList<Integer>list = new ArrayList<>();
        list.add(count);
        list.add(count2);
        int[] ans = new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
     
        return ans;
    }
}
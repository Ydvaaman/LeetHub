class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i = 0;
        int j = 0;
        while(i<n && j<m){
            if(nums1[i]!=nums2[j]){
                if(nums1[i] > nums2[j]){
                    j++;
                }else{
                    i++;
                }
            }else if(nums1[i] == nums2[j]){
                return nums1[i];
            }
        }
        return -1;
    }
}
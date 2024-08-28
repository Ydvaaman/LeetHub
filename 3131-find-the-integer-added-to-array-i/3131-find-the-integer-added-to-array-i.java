// class Solution {
//     public int addedInteger(int[] nums1, int[] nums2) {
//         Arrays.sort(nums1);
//         Arrays.sort(nums2);
//         for(int i=0;i<nums1.length;i++){
//             for(int j=0;j<nums2.length;j++){
//                 if(nums1[i]==nums2[j]){
//                     return 0;
//                 }
//                 return nums2[i]-nums1[i];
//             }
//         }
//          return -1;
//     }
// }


class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        return nums2[0]-nums1[0];
    }
}
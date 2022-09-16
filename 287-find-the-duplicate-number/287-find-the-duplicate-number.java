import java.util.*;
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0,j=1;j<nums.length;){
            if(nums[i]==nums[j]){
               return nums[i];
            }
            i++;
            j++;
        }
        return 0;
        
    }
}
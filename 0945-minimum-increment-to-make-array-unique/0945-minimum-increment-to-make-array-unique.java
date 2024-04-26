class Solution {
    public int minIncrementForUnique(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        int max = 0;
        Arrays.sort(nums);
        for(int n:nums){
           if(set.contains(n)){
               int loc = n;
               n = max;
               count+= max - loc;
           }
            set.add(n);
            max = n+1;
        }
        return count;
    }
}
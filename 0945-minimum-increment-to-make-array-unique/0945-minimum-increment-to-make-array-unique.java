class Solution {
    public int minIncrementForUnique(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        int max = 0;
        Arrays.sort(nums);
        for(int n:nums){
            if(set.contains(n)){
                count+= max-n+1;
                n=max+1;
            }
            set.add(n);
            max = n;
            
        }
        return count;
    }
}
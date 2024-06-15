class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        int count = 0;
        for(int i=0;i<k;i++){
            int temp = list.get(list.size()-1);
            list.remove(list.size()-1);
            list.add(temp+1);
            count+=temp;
        }
        return count;
    }
}
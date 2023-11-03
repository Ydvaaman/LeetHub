class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int last = numbers.length-1;
        while(start < last){
            if(numbers[start] + numbers[last] == target) break;
            if(numbers[start] + numbers[last] < target) start++;
            else last--;
        }
        return new int[]{start+1, last+1};
    }
}
class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int max = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max += 1;
            }
        }
        return max;
        
    }
}
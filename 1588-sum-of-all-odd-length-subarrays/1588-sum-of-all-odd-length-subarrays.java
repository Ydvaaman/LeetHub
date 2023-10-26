class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int len = arr.length;
        int sum = 0;
        for(int i=0;i<len;i++){
            sum+=(((i+1)*(len-i)+1)/2)*arr[i];
        }
        return sum;
    }
}
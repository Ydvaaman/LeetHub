class Solution {
    public int specialArray(int[] nums) {
        int start = 0;
        int end = nums.length;
        while(start<=end){
            int mid = start+(end-start)/2;
            int curr = count(nums,mid);
            if(curr == mid) return mid;
            else if(curr<mid){
                end = mid-1;
            }
            else if(curr>mid){
                start = mid+1;
            }
        }
        return -1;
    }
    public static int count(int[] arr, int cnt){
        int x = 0;
        for(int v:arr){
            if(v>=cnt){
                x++;
            }
        }
        return x;
    }
}
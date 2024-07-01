class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 3;
        for(int i=0;i<arr.length;i++){
           if(arr[i]%2!=0){
               count--;
                if(count==0){
            return true;
                }
        }
          else {
               count=3;
           }
        }
       
        return false;
    }
}
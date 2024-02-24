class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int[]arr:accounts){
            int sum = 0;
            for(int v : arr){
                sum=sum+v;
            }
            max = Math.max(max,sum);
        }
        // for(int i=0;i<accounts.length;i++){
        //  int sum = 0;
        //     for(int j=0;j<accounts[i].length;j++){
        //         sum = sum+accounts[i][j];
        //     }
        //     max = Math.max(max,sum);
        // }
        return max;
    }
}
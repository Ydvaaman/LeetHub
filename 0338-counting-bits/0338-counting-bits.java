class Solution {
    public int[] countBits(int n) {
              int[]res=new int[n+1];
        int p=1,j=0;
        for(int i=1;i<=n;i++){
            if(2*p==i){
                j=0;
                p=2*p;
            }
            res[i]=res[j++]+1;
        }
        return res;
    }
}

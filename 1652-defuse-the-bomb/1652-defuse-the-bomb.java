class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[code.length];
       if(k==0) return ans;
       if(k>0){
           for(int i=0;i<code.length;i++){
               int sum = 0;
               for(int j=1;j<=k;j++){
                   sum+=code[(i+j)%n];
               }
               ans[i]=sum;
           }
       }
        if(k<0){
            k=-1*k;
            for(int i=0;i<n;i++){
                int sum = 0;
                for(int j=1;j<=k;j++){
                    sum+=code[(n-j+i)%n];
                }
                ans[i]=sum;
            }
        }
        
    
    return ans;
    }
}
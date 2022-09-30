class Solution {
    public String truncateSentence(String s, int k) {
        
        String res= "";
        String[] arr1=s.split(" ");
        for(int i=0;i<k;i++){ 
            res+=arr1[i];
            if(i!=k-1)res+=" ";
          }
        return res;
    }
}
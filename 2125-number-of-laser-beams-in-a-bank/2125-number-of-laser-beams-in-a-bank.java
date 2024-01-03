class Solution {
    public int numberOfBeams(String[] bank) {
        int pSdFrequency = 0;
        int ans = 0;
        for(String s: bank){
            int cSdFrequency = 0;
            for(char c: s.toCharArray()){
                if(c == '1'){
                    cSdFrequency++;
                }
            }
            if(cSdFrequency > 0){
                ans+= cSdFrequency * pSdFrequency;
                pSdFrequency = cSdFrequency;
            }
        }
        return ans;
    }
}
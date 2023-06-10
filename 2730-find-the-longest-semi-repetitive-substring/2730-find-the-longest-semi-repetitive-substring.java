class Solution {
    public int longestSemiRepetitiveSubstring(String s) {
        int lP = 0,rP = 0,count = 0,ans = 1;
        while(rP<s.length()-1 && lP<=rP){
            rP++;
            if(s.charAt(rP) == s.charAt(rP-1))count++;
            while(count>=2){
                lP++;
                if(s.charAt(lP) == s.charAt(lP-1))count--;
            }
            ans = Math.max(ans,rP-lP+1);
        }
        return ans;
        
    }
}
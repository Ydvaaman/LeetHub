class Solution {

    public String reversePrefix(String word, char ch) {
        String str = "";
        String ans = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                
                str = word.substring(0, i + 1);
                
                ans += rev(str);
                 ans +=  word.substring(i + 1,word.length());
                
                break;
            }
            
        }

        if(ans.equals(""))
        {
            return word;
        }
        return ans;
    }

    public String rev(String s) {
        String ans = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            ans += s.charAt(i);
        }
        return ans;
    }
}

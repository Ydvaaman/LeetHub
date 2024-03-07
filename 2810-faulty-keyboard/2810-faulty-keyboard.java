public class Solution {

    public String finalString(String s) {
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'i') {
               int idx = i;
                String res = str.substring(0, str.length());
                str = rev(res);
            } else{
                str += s.charAt(i);
            }
        }

        return str;
    }

    public String rev(String s) {
        String ans = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            ans += s.charAt(i);
        }
        return ans;
    }
}

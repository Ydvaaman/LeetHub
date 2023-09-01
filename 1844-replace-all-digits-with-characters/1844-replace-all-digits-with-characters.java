class Solution {
    public String replaceDigits(String s) {
      char[] ch = s.toCharArray();
        for(int i = 1; i < ch.length; i += 2)
            ch[i] += ch[i - 1] - '0';
        return new String(ch);
    }
}

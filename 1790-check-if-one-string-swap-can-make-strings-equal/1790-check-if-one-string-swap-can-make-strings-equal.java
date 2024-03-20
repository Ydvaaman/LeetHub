class Solution {

    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;
        if (s1.length() != s2.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            if (!map.containsKey(s2.charAt(i))) {
                return false;
            } else {
                char[] ch = s2.toCharArray();
                for (int j = i + 1; j < ch.length; j++) {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                    String str = String.valueOf(ch);
                    if (str.equals(s1)) {
                        return true;
                    }
                    temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        return false;
    }
}

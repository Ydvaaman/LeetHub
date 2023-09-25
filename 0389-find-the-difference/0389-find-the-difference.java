class Solution {

    public char findTheDifference(String s, String t) {
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);

        int s_pointer = 0;
        int t_pointer = 0;

        while (s_pointer < s.length()) {
            if (str1[s_pointer] != str2[t_pointer]) {
                return str2[t_pointer];
            }
            s_pointer++;
            t_pointer++;
        }
        return str2[t.length() - 1];
    }
}

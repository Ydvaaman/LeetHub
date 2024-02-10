class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        char[] chr = s.toCharArray();
        int sum = 0;

        for (int i = 0; i < chr.length; i++) {
            if (chr[i] == '(') {
                if (sum > 0) {
                    sb.append(chr[i]);
                }
                sum += 1;
            } else {
                sum -= 1;
                if (sum > 0) {
                    sb.append(chr[i]);
                }
            }
        }

        return sb.toString();
    }
}

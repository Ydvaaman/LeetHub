class Solution {

    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String r = rev(words[i]);
            for (int j = 0; j < words.length; j++) {
                if (i<j && j<words.length && r.equals(words[j])) {
                    count++;
                }
            }
        }
        return count;
    }

    public String rev(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}

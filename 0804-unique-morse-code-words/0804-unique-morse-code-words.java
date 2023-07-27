class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] a = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> st = new HashSet<String>();
        for (String str : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                sb.append(a[str.charAt(i)-97]);
            }
            st.add(sb.toString());
        }
        return st.size();
    }
}
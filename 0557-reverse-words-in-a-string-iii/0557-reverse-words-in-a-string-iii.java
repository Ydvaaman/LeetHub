class Solution {
    public String reverseWords(String s) {
        if(s == null || s.length() == 0){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        String [] wordSplit = s.split(" ");
        for(String word:wordSplit){
            StringBuilder sb1 = new StringBuilder();
            sb1.append(word);
            sb1.reverse();
            sb.append(sb1.toString() + " ");
        }
        return sb.toString().trim();

    }
}
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] str = text.split(" ");
        int count = 0;
        for(int i=0;i<str.length;i++){
            for(int j=0;j<brokenLetters.length();j++){
                if(str[i].contains(Character.toString(brokenLetters.charAt(j)))){
                    count++;
                    break;
                }
            }
        }
        int res = str.length-count;
        return res;
    }
}
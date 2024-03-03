class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String ans = "";
        if(s.length()!=words.size()) return false;
        for(int i = 0;i<words.size();i++){
            ans = words.get(i);
            if(s.charAt(i)==(ans.charAt(0))){
            
            }else{
                return false;
            }
        }
        return true;
    }
}
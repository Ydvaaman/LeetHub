class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String ans = "";
        String res = "";
        for(int i = 0;i<words.size();i++){
            ans = words.get(i);
               res +=ans.charAt(0);
           
            System.out.print(res);  
        }
        return s.equals(res);
    }
}
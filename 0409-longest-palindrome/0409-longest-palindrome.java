class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1) return 1;
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }else{
                set.remove(s.charAt(i));
                count = count+2;
            }
        }
         if(!set.isEmpty()){
             count=count+1;
         }
        return count;
    }
}
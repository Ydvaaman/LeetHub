class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int length = -1;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(j)==s.charAt(i)){
                    length=Math.max(length,j-i-1);
                }
            }
        }
        
        return length;
    }
}
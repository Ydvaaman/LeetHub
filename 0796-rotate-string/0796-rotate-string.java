class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal)) return true;
        for(int i=0;i<s.length();i++){
            String s1 = s.substring(0,i);
            String s2 = s.substring(i);
            String s3 = s2+s1;
            if(s3.equals(goal)){
                return true;
            }
        }
        return false;

    }
}
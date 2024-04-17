class Solution {
    public String greatestLetter(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for(int i=ch.length-1;i>=0;i--){
            if(Character.isUpperCase(ch[i])==true && s.contains(Character.toLowerCase(ch[i])+"")){
                return ch[i]+"";
            }
        }
        return "";
    }
}
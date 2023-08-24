class Solution {
    public char findTheDifference(String s, String t) {
        char[] c = s.toCharArray();
        char[]ch = t.toCharArray();
        
        Arrays.sort(c);
        Arrays.sort(ch);
        
        int s_pointer = 0;
        int t_pointer = 0;
        
        while(s_pointer < s.length()){
            if(c[s_pointer] != ch[t_pointer]){
                 return ch[t_pointer];
            }
            s_pointer++;
            t_pointer++;
        }
        return ch[t.length()-1];
    }
}
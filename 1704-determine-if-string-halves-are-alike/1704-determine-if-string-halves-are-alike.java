class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int count = 0;
        for(int i=0;i<s.length()/2;i++){
            char ch = s.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i' ||ch=='o'|| ch=='u'){
                count++;
            }
        }
        for(int i=s.length()/2;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i' ||ch=='o'|| ch=='u'){
                count--;
            }
        }
        if(count ==0)return true;
        return false; 
        
    }
}
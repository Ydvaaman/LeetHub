class Solution {
    public boolean isValid(String word) {
        int n = word.length();
        if(n<3) return false;
        int cnt = 0;
        int vol = 0;
        int con = 0;
        for(int i=0;i<n;i++){
            char ch = word.charAt(i);
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' || ch>='0' && ch<='9'){
                cnt++;
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || 
                   ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                    vol++;
                }else{
                    if(ch>='a' && ch<='z'|| ch>='A' && ch<='Z'){
                        con++;
                    }
                }
            }else{
               return false;
            }
        }
        if(cnt >= 3 && vol >= 1 && con>=1){
            return true;
        }
        return false;
    }
}
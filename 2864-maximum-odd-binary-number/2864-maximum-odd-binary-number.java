class Solution {
    public String maximumOddBinaryNumber(String s) {
        String [] str = s.split("");
        int count = 0;
        for(int i=0;i<str.length;i++){
            if(str[i].equals("1")){
                count++;
              }
        }
        String[] res = new String[s.length()];
        for(int i=0;i<res.length;i++){
            res[i]="0";
        }
        res[res.length-1]="1";
        count = count-1;
        int idx = 0;
        while(count>0){
            res[idx] = "1";
            idx++;
            count--;
        }
        String ans = "";
        for(int i=0;i<res.length;i++){
            ans+=res[i];
        }
        
        return ans;
    }
}
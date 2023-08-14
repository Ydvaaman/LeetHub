class Solution {
    public int myAtoi(String s) {
        long num = 0;
        char[] chars = s.toCharArray();
        if(chars.length==0) return 0;
        int i=0,sign=1;
        char current = chars[i];
        
        // skip all the white spaces
        while(current == ' '){
            i++;
            if(i==chars.length) return 0;
            current = chars[i];
        }
        
        // check the sign if it is '+' or '-'
        if(current == '-'){
            sign = -1;
            i++;
        }else if(current == '+'){
            sign = 1;
            i++;
        }
        
        for(; i<chars.length;i++){
            current = chars[i];
            if(current <'0' || current > '9') break;
            else{
                num*=10;
                num+=current - '0';
                if(sign * num <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
                else if(sign * num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            }
        }
        num*=sign;
        return (int)num;
    }
}
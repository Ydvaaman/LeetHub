class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        int ptr = 0;
        String res = "";
        while(ptr < s.length()){
            char curr = s.charAt(ptr);
            if(Character.isDigit(curr)){
                int num = 0;
                while(Character.isDigit(s.charAt(ptr))){
                    num = num * 10 + s.charAt(ptr) - '0';
                    ptr++;
                }
                numStack.push(num);
            }else if(curr == '['){
                strStack.push(res);
                res = "";
                ptr++;
            }else if(curr == ']'){
                StringBuilder sb = new StringBuilder(strStack.pop());
                int count = numStack.pop();
                for(int i=1;i<=count;i++){
                    sb.append(res);
                }
                    res = sb.toString();
                    ptr++;
            }else{
                res += curr;
                ptr++;
            }
        }
        return res;
    }
}
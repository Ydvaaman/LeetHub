class Solution {
    public String interpret(String command) {
        StringBuffer sbf = new StringBuffer();
        int i=0;
        while(i < command.length()){
            if(command.charAt(i) == 'G'){
                sbf.append("G");
                i++;
            }
            else if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                sbf.append("o");
                i = i+2;
            }
            else{
                sbf.append("al");
                i = i+4;
            }    
        }
          return sbf.toString();      
     }
}
class Solution {
    public String capitalizeTitle(String title) {
        String[] str = title.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length;i++){
            String s = str[i];
            if(s.length()<=2){
                sb.append(s.toLowerCase());
            }
            else if(!s.isEmpty()){
                char first = Character.toUpperCase(s.charAt(0));
                sb.append(first).append(s.toLowerCase().substring(1));
            }
            if(i<str.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
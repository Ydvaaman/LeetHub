class Solution {
    public String decodeMessage(String key, String message) {
        StringBuilder ans = new StringBuilder();
        key = key.replaceAll(" ","");
        HashMap<Character,Character> map = new HashMap<>();
        char original = 'a';
        for(int i = 0;i<key.length();i++){
            if(!map.containsKey(key.charAt(i))){
                map.put(key.charAt(i),original++);
            }
            
        }
        for(int i=0;i<message.length();i++){
            if(map.containsKey(message.charAt(i))){
                ans.append(map.get(message.charAt(i)));
            }else{
                ans.append(message.charAt(i));
            }
        }
        return ans.toString();
    }
}
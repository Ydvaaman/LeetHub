class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Map<Character,Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0;i<allowed.length();i++){
            map.put(allowed.charAt(i),map.getOrDefault(allowed.charAt(i),0)+1);
        }
        for(int i=0;i<words.length;i++){
            String str = words[i];
            for(int j=0;j<str.length();j++){
                if(!map.containsKey(str.charAt(j))){
                    break;
                }else if(map.containsKey(str.charAt(j)) && j==str.length()-1){
                    count++;
                }
            }
        }
        return count;
    }
}
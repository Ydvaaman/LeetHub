class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int a = map.get(s.charAt(0));
        for(char c:map.keySet()){
            if(map.get(c)!=a){
                return false;
            }
        }
        return true;
    }
}
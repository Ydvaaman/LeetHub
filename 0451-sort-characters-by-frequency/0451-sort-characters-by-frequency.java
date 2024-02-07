class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Character> chars = new ArrayList<>(map.keySet());
        Collections.sort(chars,(a,b)->map.get(b)-map.get(a));
        StringBuilder sb = new StringBuilder();
        for(Character ch: chars){
            for(int i=0;i<map.get(ch);i++){
                sb.append(ch);
            }
        }
        return sb.toString();
        
    }
}
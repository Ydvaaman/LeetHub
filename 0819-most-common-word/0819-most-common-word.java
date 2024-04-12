class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String,Integer> map = new HashMap<>();
        String[] str = paragraph.toLowerCase().replaceAll("[^a-zA-Z]"," ").split("\\s+");
        for(String c:str){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<banned.length;i++){
            map.remove(banned[i]);
        }
        int max = -1;
        String ans = "";
        for(String ch:map.keySet()){
            if(map.get(ch)>max){
                ans=ch;
                max = map.get(ch);
            }
        }
        return ans;
    }
}
class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        Set<String>set = new HashSet<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i!=j && words[i].contains(words[j])){
                    set.add(words[j]);
                }

            }
        }
        for(String s:set){
            list.add(s);
        }
        return list;        
    }
}
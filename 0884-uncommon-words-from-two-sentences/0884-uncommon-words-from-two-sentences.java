class Solution {

    public String[] uncommonFromSentences(String s1, String s2) {
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : str1) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String v : str2) {
            map.put(v, map.getOrDefault(v, 0) + 1);
        }
        ArrayList<String> list = new ArrayList<>();
        for (String v : map.keySet()) {
            if(map.get(v)==1){
                list.add(v);
            }
        }
        String[] ans = new String[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}

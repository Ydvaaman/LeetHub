class Solution {
    
    boolean checkZero(HashMap<Character,Integer>map){
        for(int val:map.values()){
            if(val!=0){
                return false;
            }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Character,Integer>map = new HashMap<>();
        for(char ch:p.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int i=0,j=0;
        while(j<s.length()){
            char c = s.charAt(j);
            map.put(c,map.getOrDefault(c,0)-1);
            if(j-i+1==p.length()){
                if(checkZero(map)){
                    list.add(i);
                }
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
                i++;
            }
            j++;
        }
        return list;
    }
}
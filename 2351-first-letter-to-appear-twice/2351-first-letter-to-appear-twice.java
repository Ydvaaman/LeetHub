class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            if(map.get(s.charAt(i))>=2){
                return s.charAt(i);
            }
        
        }
        return ' ';
    }
}

// a 1
// b 1
// c 2

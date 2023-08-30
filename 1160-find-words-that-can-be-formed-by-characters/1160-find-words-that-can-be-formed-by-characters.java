class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] ch = chars.toCharArray();
        for(int i=0;i<chars.length();i++){
            map.put(ch[i],map.getOrDefault(ch[i],0)+1);
        }
        
        int ans=0;
        label:
        for(String str:words){
            HashMap<Character,Integer> map1 = new HashMap<>(map);
            
            for(char ch1:str.toCharArray()){
                if(map1.containsKey(ch1)==false){
                   continue label; 
                }
                
                map1.put(ch1,map1.get(ch1)-1);
                
                if(map1.get(ch1)==0) map1.remove(ch1);
                
            }
            
            ans+=str.length();
            // System.out.println(map1);
        }
        
        
        return ans;
    }
}
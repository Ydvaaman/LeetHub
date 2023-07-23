class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> alphabet = new HashSet<>();
        
        for(int i = 'a'; i<='z';i++){
            alphabet.add((char)i);
        }
        for(int i=0;i<sentence.length();i++){
            alphabet.remove(sentence.charAt(i));
            if(alphabet.isEmpty())
                return true;
        }
        return false;
        
    }
}
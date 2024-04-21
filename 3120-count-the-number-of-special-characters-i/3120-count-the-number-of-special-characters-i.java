class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<word.length();i++){
            if(!list.contains(word.charAt(i))){
                list.add(word.charAt(i));
            }
        }
        for(int i=0;i<list.size();i++){
            char temp = list.get(i);
            if(Character.isUpperCase(temp)){
                temp = Character.toLowerCase(temp);
                if(list.contains(temp)){
                    count++;
                }
            }
        }
        return count;
    }
}
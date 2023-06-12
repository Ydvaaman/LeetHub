class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int key = 0;
        int count = 0;
        
        if(ruleKey.equals("type"))key = 0;
        else if(ruleKey.equals("color"))key = 1;
        else if(ruleKey.equals("name"))key = 2;
        
        for(List<String>temp:items){
            if(temp.get(key).equals(ruleValue))count++;
        }
        return count;
        
    }
}
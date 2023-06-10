class Solution {
    public List<String> cellsInRange(String s) {
        List<String> list = new ArrayList<>();
        
        int col1 = s.charAt(0); 
        int row1 = s.charAt(1); 
        
        int col2 = s.charAt(3); 
        int row2 = s.charAt(4); 
        
        for(int j = col1; j <= col2; j++) {
            for(int i = row1; i <= row2; i++) {
                StringBuffer sb = new StringBuffer();
                
                sb.append((char)j); 
                sb.append((char)i); 
                
                list.add(sb.toString()); 
            }
        }
        
        return list; 
    }
}
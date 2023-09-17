class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list=new ArrayList<>();
        
        for(int i=1; i<=n; i++) list.add(i);
        
        Collections.sort(list,(a,b)->{
            String str1=a+"";
            String str2=b+"";
            return str1.compareTo(str2);
            });
        
        
        return list;
    }
}
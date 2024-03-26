class Solution {
    public int countSegments(String s) {
        if(s.trim().length()==0) return 0;
        String[] str = s.trim().split("\\s+");
        System.out.println(Arrays.toString(str));
        return str.length;
    }
}
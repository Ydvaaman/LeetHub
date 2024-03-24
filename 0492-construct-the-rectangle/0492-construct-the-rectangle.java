class Solution {
    public int[] constructRectangle(int area) {
        int[] ans = new int[2];
        int l = area;
        int w = 1;
        while(l>=w){
            if(area == l*w){
            ans = new int[]{l,w};
            }
            w++;
            l=area/w;
        }
        
        return ans;
    }
}
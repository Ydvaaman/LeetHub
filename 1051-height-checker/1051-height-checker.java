class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] ans = heights.clone();
        Arrays.sort(ans);
        int count= 0;
        for(int i=0;i<n;i++){
            if(heights[i]!=ans[i]){
                count++;
            }
        }
        System.out.println(Arrays.toString(ans));
        return count;
        
    }
}
class Solution {
    public int mostWordsFound(String[] sentences) {
        // int count = Integer.MIN_VALUE;  
    //     for(int i=0;i<sentences.length;i++){ 
    //         count = Math.max(count, countword(sentences[i]));
    //     }
    //     return count;
    // }
    // public int countword(String str)
    // {
    //     int count =1;
    //      if(str.length() == 0)
    //      {
    //         return 0;
    //      }
    //     for(int i=0;i<str.length();i++)
    //     {
    //         if(str.charAt(i)==' ')
    //         {
    //             count++;
    //         }
    //     }
        int max = Integer.MIN_VALUE;
        for(String str : sentences){
            int count = 1;
            for(char ch : str.toCharArray()){
                if(ch == ' '){
                    count++;
                }
            }
            max = Math.max(count,max);
        }
        return max;
    }
}
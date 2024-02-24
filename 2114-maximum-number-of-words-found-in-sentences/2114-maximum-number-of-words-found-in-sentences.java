class Solution {
    public int mostWordsFound(String[] sentences) {
        int count = Integer.MIN_VALUE;
        for(int i=0;i<sentences.length;i++){
            String str = sentences[i]; 
            count = Math.max(count, countword(str));
        }
        return count;
    }
    public int countword(String str)
    {
        int count =1;
         if(str.length() == 0)
         {
            return 0;
         }
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                count++;
            }
        }
        return count;
    }
}
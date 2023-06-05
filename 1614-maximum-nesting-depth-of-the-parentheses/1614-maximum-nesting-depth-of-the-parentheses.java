import java.util.*;
class Solution {
    public int maxDepth(String s) {
        int depth=0, open=0;
        for(char c:s.toCharArray()){
            if(c == '(')
                open++;
            if(c == ')')
                open--;
            depth = Math.max(depth,open);
        }
        return depth;
    }
}
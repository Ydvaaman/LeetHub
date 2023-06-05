// import java.util.*;
// class Solution {
//     public int maxDepth(String s) {
//         int depth=0, open=0;
//         for(char c:s.toCharArray()){
//             if(c == '(')
//                 open++;
//             if(c == ')')
//                 open--;
//             depth = Math.max(depth,open);
//         }
//         return depth;
//     }
// }

import java.util.*;

class Solution {

    public int maxDepth(String s) {
        Stack<String> stack = new Stack<>();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)== '(' ){
                stack.push("(");
                if (stack.size() > max) max = stack.size();
            } else if (s.charAt(i)== ')') {
                stack.pop();
            }
        }
        return max;
    }
}

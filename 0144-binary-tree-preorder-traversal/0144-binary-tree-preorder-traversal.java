
//using recursion
// class Solution {
//     public List<Integer> preorderTraversal(TreeNode root) {
//         List<Integer> list = new ArrayList<>();
//         if(root == null) return list;
//         list.add(root.val);
//         list.addAll(preorderTraversal(root.left));
//         list.addAll(preorderTraversal(root.right));
//         return list;
//     }
// }

// using stack
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preOrder = new ArrayList<>();
        if(root == null) return preOrder;
        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(root);
        while(!st.isEmpty()){
           root = st.pop();
            preOrder.add(root.val);
            if(root.right!=null){
                st.push(root.right);
            }
            if(root.left!=null){
                st.push(root.left);
            }
        }
        
        return preOrder;
    }
}
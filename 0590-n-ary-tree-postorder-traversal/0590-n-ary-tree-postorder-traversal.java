/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        ArrayList<Integer>list= new ArrayList<>();
        helper(root,list);
        return list;
        
    }
    public void helper(Node root,List<Integer>list){
        if(root==null)return;
        for(int i=0;i<root.children.size();i++){
            helper(root.children.get(i),list);
        }
        list.add(root.val);
    }
}
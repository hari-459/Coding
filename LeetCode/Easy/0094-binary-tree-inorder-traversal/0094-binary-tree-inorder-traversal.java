class Solution {
    public static void inorder(TreeNode root,List<Integer> traversal){
        if(root==null) return;
        inorder(root.left,traversal);
        traversal.add(root.val);
        inorder(root.right,traversal);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> traversal=new ArrayList<>();
        inorder(root,traversal);
        return traversal;
    }
}
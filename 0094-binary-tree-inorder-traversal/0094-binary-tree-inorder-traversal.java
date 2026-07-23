/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        return inorderTraversal2(root,list);
    }

    private List<Integer> inorderTraversal2(TreeNode node,List<Integer> list) {
        if(node == null){
            return null;
        }
        inorderTraversal2(node.left,list);
        list.add(node.val);
        inorderTraversal2(node.right,list);
        return list;
    }
}
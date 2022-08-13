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
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        boolean isBST = true;
        
        inorderTraversal(root, list);
        
        int size = list.size();
        
        for(int i = 0; i < (size - 1); i++){
            if(list.get(i) >= list.get(i + 1)){
                isBST = false;
                break;
            }
        }
        
        return isBST;
    }
    
    public void inorderTraversal(TreeNode root, List<Integer> list){
        if(root == null)
            return;
        inorderTraversal(root.left, list);
        list.add(root.val);
        inorderTraversal(root.right, list);
        
    }
}
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
    public int kthSmallest(TreeNode root, int k) {
        
        ArrayList<Integer> arr=inorder(root);
        return arr.get(k-1);
    }
    public ArrayList<Integer> inorder(TreeNode root){
        ArrayList<Integer> arr=new ArrayList<>();
        if(root==null){
            return arr;
        }
        arr.addAll(inorder(root.left));
        arr.add(root.val);
        arr.addAll(inorder(root.right));
        return arr;
    }
}

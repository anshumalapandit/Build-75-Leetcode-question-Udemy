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
import java.util.*;
class Solution {
    //max needs to maintain its state across all recursive calls to the dfs function
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        int ans=dfs(root);
        return max;
        
    }
    public int dfs(TreeNode root){
        if(root==null){
            return 0;
        }
        int LM=Math.max(0,dfs(root.left));
        int RM=Math.max(0,dfs(root.right));
        max=Math.max(max,root.val+LM+RM);
        return root.val+Math.max(LM,RM);
    }
}

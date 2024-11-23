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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
       // q.add(null);
        while(!q.isEmpty()){
           // TreeNode currNode=q.remove();
            int size=q.size();
            List<Integer> curLevel=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curNode=q.remove();
                curLevel.add(curNode.val);

                if(curNode.left!=null){
                    q.add(curNode.left);
                }
                if(curNode.right!=null){
                    q.add(curNode.right);
                }
            }
            ans.add(curLevel);
        }
        return ans;
    }
}

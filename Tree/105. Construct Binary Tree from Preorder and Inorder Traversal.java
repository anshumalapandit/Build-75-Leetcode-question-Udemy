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
// T.C =>0(N) S.C=> 0(N)
class Solution {
    int preorderIndex;
    HashMap<Integer,Integer> inorderindex;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preorderIndex=0;
        inorderindex=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            inorderindex.put(inorder[i],i);
        }
        return arrayToTree(preorder,0,inorder.length-1);
    }
    public TreeNode arrayToTree(int [] preorder, int left,int right){
        if(left>right){
            return null;
        } // current index wo hai jo jaha root ki value hai
        int rootvalue=preorder[preorderIndex++];
        TreeNode root=new TreeNode(rootvalue);
        root.left=arrayToTree(preorder,left, inorderindex.get(rootvalue)-1); // left se cur-1 tak
        root.right=arrayToTree(preorder,inorderindex.get(rootvalue)+1,right);   // cur+1 se right tak
        return root;
    }
}

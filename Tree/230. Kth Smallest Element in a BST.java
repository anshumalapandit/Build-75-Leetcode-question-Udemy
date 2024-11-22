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
// another approach : using iterative
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
        
        Stack<TreeNode> s=new Stack<>();
        while(true){
            while(root!=null){
                s.push(root);
                root=root.left;
            }
            root=s.pop(); //first smallest
            k=k-1;
            if(k==0) return root.val;
            root=root.right;
        }
    }
    
}

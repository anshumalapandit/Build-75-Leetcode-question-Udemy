/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// T.C==0(n) S.C=>0(n) for both function
import java.util.*;
public class Codec {
// using preorder for this 
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null){
            return "#";
        }
        String left=serialize(root.left);
        String right=serialize(root.right);
        return root.val+","+left+","+right;
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) 
    { // 1. first convert this string into queue data structure
        Queue<String> q=new LinkedList<>(Arrays.asList(data.split(",")));
        return dfs(q);
    }
    public TreeNode dfs(Queue<String> q){
        String str=q.poll();
         // if curr node is # then it is null attach null 
        if(str.equals("#")){
        return null;
       }
        //2.  remove it create a node
        TreeNode node=new TreeNode(Integer.valueOf(str));
        // 3.  remove node attached to the left
        node.left=dfs(q);
        node.right=dfs(q);
        return node;        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));

class Exercise {
  //T.C=0(N) S.C=0(N)
    public TreeNode invertTree(TreeNode root) {
        // write your code here
        if(root==null){
            return null;
        }
        TreeNode left=invertTree(root.left);
        TreeNode right=invertTree(root.right);
        root.left=right;
        root.right=left;
        return root;
        
    }
} 

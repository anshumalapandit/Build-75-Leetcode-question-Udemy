class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(dfs(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(char board[][],String word,int r,int c,int cur){
        if(word.length()==cur){
            return true;
        }
        if(r<0 || r>=board.length || c<0 || c>=board[0].length || board[r][c]=='#'){
            return false;
        }
        char ch=board[r][c];
        if(word.charAt(cur)!=ch){
            return false;
        }
        // mark visited of particular cell then go its top left bottom right
        board[r][c]='#';
        boolean top=dfs(board,word,r-1,c,cur+1);
        boolean left=dfs(board,word,r,c-1,cur+1);
        boolean bottom=dfs(board,word,r+1,c,cur+1);
        boolean right=dfs(board,word,r,c+1,cur+1);
        // now u checked all mark univisted those cell
        board[r][c]=ch;
        return top||left||bottom||right;
    }
}
T.C=> 0(R*c*4^rc) S.C=> 0(1)

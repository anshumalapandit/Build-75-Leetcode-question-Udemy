class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int r1=0, c1=0;
        int r2=matrix.length-1,c2=matrix[0].length-1;
        while(r1<=r2 && c1<=c2){
            // first row c1 to c2
            for(int i=c1;i<=c2;i++){
                ans.add(matrix[r1][i]);
            }
            // c2 = r1+1 to r2
            for(int i=r1+1;i<=r2;i++){
                ans.add(matrix[i][c2]);
            }
            // imp edges case
          // coz these cases wil not always true for every matrix 
            if(r1<r2 && c1<c2){
            // r2= c2-1 to c1
            for(int i=c2-1;i>=c1;i--){
                ans.add(matrix[r2][i]);
            }
            //c1=r2-1 to r1+1;
            for(int i=r2-1;i>=r1+1;i--){
                ans.add(matrix[i][c1]);
            }
            }
            c1++;
            c2--;
            r1++;
            r2--;
        }
        return ans;
    }
}

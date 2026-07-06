class Solution {
    public void setZeroes(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        boolean br[]=new boolean[r];
        boolean bc[]=new boolean[c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                 if(matrix[i][j]==0){
                    br[i]=true;
                    bc[j]=true;
                 }
            }
        }
        for(int i=0;i<r;i++){
            if(br[i])
            for(int j=0;j<c;j++){
                matrix[i][j]=0;
            }
        }
        for(int i=0;i<c;i++){
            if(bc[i])
            for(int j=0;j<r;j++){
                matrix[j][i]=0;
            }
        }
    }
}
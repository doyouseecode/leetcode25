class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r * c) {
            return mat;
        }
            int[][] res = new int[r][c];
            int k = 0 , l = 0;
            for(int i = 0; i < mat.length; i++){
                for(int j = 0; j < mat[0].length; j++){
                    res[k][l] = mat[i][j];
                    l++;
                    if(l==c){
                        k++;
                        l=0;
                    }
                }

            }
            return res;
    }
}
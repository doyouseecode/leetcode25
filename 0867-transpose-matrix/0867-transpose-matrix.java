class Solution {
    public int[][] transpose(int[][] matrix) {
        if(matrix.length == matrix[0].length){
            for(int i = 0; i < matrix.length; i++){
                for(int j = i; j < matrix.length; j++){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
            return matrix;
        }
        else {
            int[][] res = new int[matrix[0].length][matrix.length];
            for (int i = 0; i < matrix[0].length; i++){
                for(int j = 0; j < matrix.length;j++){
                    res[i][j] = matrix[j][i];
                }
            }
            return res;
        }
    }
}
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
    // Check for null matrix
    if (mat == null || mat.length == 0 || mat[0].length == 0) {
        throw new IllegalArgumentException("Matrix cannot be null or empty.");
    }
    
    int m = mat.length, n = mat[0].length;
    if (m * n != r * c) {
        return mat; // Reshape not possible, return original matrix
    }

    int[][] res = new int[r][c];
    int k = 0, l = 0;
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            res[k][l] = mat[i][j];
            l++;
            if (l == c) {
                k++;
                l = 0;
            }
        }
    }
    return res;
    }
}
class Solution{
    public void setZeroes(int[][] matrix){
         int m = matrix.length;
         int n = matrix[0]. length;

         boolean [] rowtrack = new boolean[m];
         boolean[] coltrack = new boolean[n];

         for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rowtrack[i] = true; // Note: Is row ko zero karna hai
                    coltrack[j] = true; // Note: Is col ko zero karna hai
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rowtrack[i] || coltrack[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
class Solution {
    
    public static int[][] ans(int [][] matrix){
        int n = matrix.length;
        int rotated[][] = new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rotated[j][n-i-1] = matrix[i][j];
            }
        }
        return rotated;
    }
    
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] rotated = ans(matrix);
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                matrix[i][j] = rotated[i][j];
            }
        }
    }
}
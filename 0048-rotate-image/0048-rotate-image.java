class Solution {
    
    public static int[][] ans(int matrix[][]){
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
       int rotated[][] = ans(matrix) ;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              matrix[i][j] = rotated[i][j];
            }
           
        }
    }
}

//  int n = matrix.length;
//     int [][] ans = new int[n][n] ;
    
//     for(int i = 0 ; i < matrix.length ; i++){
//         for(int j = 0 ; j< matrix.length ; j++){
//             ans[j][n-1-i] = matrix[i][j];
//         }
//     }
    
//     for(int i = 0 ; i < matrix.length ; i++){
//         for(int j = 0 ; j< matrix.length ; j++){
//             matrix[i][j] = ans[i][j];
//         }
//     }
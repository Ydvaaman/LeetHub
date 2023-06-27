class Solution {
    
    public static void makeRow(int matrix[][],int n,int m,int i){
        for(int j=0;j<n;j++){
            if(matrix[i][j]!=0){
                matrix[i][j] = -10000000;
            }
            
        }
    }
    
    public static void makeCol(int matrix[][],int n,int m,int j){
        for(int i=0;i<m;i++){
            if(matrix[i][j]!=0){
                matrix[i][j] = -10000000;
            }
        }
    }
    
    
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    makeRow(matrix,n,m,i);
                    makeCol(matrix,n,m,j);
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]== -10000000){
                    matrix[i][j]=0;
                }
                
            }
        }
    }
}
class Solution {
    
    // making rows negative excluding 0's
    public static void makeRow(int matrix[][],int n,int m,int i){
        for(int j=0;j<n;j++){
            if(matrix[i][j]!=0){
                matrix[i][j] = -10000000;
            }
            
        }
    }
    
      // making cols negative excluding 0's
    public static void makeCol(int matrix[][],int n,int m,int j){
        for(int i=0;i<m;i++){
            if(matrix[i][j]!=0){
                matrix[i][j] = -10000000;
            }
        }
    }
    
    // main function
    public void setZeroes(int[][] matrix) {
        int n = matrix[0].length;
        int m = matrix.length;
       
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    makeRow(matrix,n,m,i);
                    makeCol(matrix,n,m,j);
                }
            }
        }
        
        // itterate through the matrix and mark 0's where negative is present 
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]== -10000000){
                    matrix[i][j]=0;
                }
                
            }
        }
    }
}
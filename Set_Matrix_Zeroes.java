//Time Complexity: O(mxn)
//Space Complexity: O(1)
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean firstrowhas0 = false;
        boolean firstcolhas0 = false;

        //checking first row has 0
        for(int j=0; j<n; j++){
            if(matrix[0][j]==0){
                firstrowhas0 = true;
            }
        }

        //checking first col has 0
        for(int i=0; i<m; i++){
            if(matrix[i][0]==0){
                firstcolhas0 = true;
            }
        }

        for(int i=1; i<m; i++){
            for(int  j=1; j<n; j++){
                if(matrix[i][j]==0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(matrix[0][j]==0 || matrix[i][0]==0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(firstrowhas0){   //if 1st row has 0
            for(int j=0; j<n; j++){
                matrix[0][j] = 0;
            }
        }

        if(firstcolhas0){   //if 1st col has 0
            for(int i=0; i<m; i++){
                matrix[i][0] = 0;
            }
        }
    }
}

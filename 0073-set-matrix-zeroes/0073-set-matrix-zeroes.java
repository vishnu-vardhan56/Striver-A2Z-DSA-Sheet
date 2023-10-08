class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> cols = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(int i : rows){
           for(int j = 0;j<m;j++){
               matrix[i][j] = 0;
           }
        }
        for(int i : cols){
           for(int j = 0;j<n;j++){
               matrix[j][i] = 0;
           }
        }
        
    }
}
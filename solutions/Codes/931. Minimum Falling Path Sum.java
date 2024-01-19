class Solution {
    public int minFallingPathSum(int[][] A) {
        int n = A.length;
        
        for(int i=1; i<n; i++){
            for(int j=0; j<n; j++){
                int min = A[i-1][j];
                if(j>0)min = Math.min(min,A[i-1][j-1]);
                if(j<n-1)min = Math.min(min,A[i-1][j+1]);
                A[i][j] += min;
            }
        }
        
        int ans = 100000;
        for(int i=0; i<n; i++){
            ans = Math.min(ans,A[n-1][i]);
        }
        return ans;
    }
}
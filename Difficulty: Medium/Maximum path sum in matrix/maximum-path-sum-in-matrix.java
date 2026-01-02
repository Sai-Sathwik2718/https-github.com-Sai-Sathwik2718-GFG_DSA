class Solution {
    public int maximumPath(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] dp = new int[n][m];

        // first row initialization
        for (int j = 0; j < m; j++) {
            dp[0][j] = mat[0][j];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {

                int up = dp[i - 1][j];
                int ld = (j > 0) ? dp[i - 1][j - 1] : Integer.MIN_VALUE;
                int rd = (j < m - 1) ? dp[i - 1][j + 1] : Integer.MIN_VALUE;

                dp[i][j] = mat[i][j] + Math.max(up, Math.max(ld, rd));
            }
        }

        int ans = Integer.MIN_VALUE;
        for (int j = 0; j < m; j++) {
            ans = Math.max(ans, dp[n - 1][j]);
        }
        return ans;
    }
}

class Solution {
    public int minimumTotal_simple(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][];
        dp[triangle.size() - 1] = new int[triangle.size()];
        for(int i = triangle.size() - 2; 0 <= i; i--) {
            dp[i] = new int[i + 1];
            for(int j = 0; j < dp[i].length; j++)
                dp[i][j] = (int) Math.min(dp[i + 1][j] + triangle.get(i + 1).get(j), dp[i + 1][j + 1] + triangle.get(i + 1).get(j + 1));
        }
        return dp[0][0] + triangle.get(0).get(0);
    }
    
    private void dfs(int[] dp, List<List<Integer>> triangle, int i){
        if(i < 0)
            return;
        for(int j = 0; j <= i; j++)
            dp[j] = (int) Math.min(dp[j],dp[j+1]) + triangle.get(i).get(j);
        dfs(dp, triangle, i - 1);
    }
    
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] dp = new int[triangle.size() + 1];
        dfs(dp, triangle, triangle.size() - 1);
        return dp[0];
        
    }
}
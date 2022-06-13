class Solution {
    public int deleteAndEarn(int[] nums) {        
        int[] buckets = new int[10001];
        for(int i : nums)
            buckets[i] += i;
        int[] dp = new int[10001];
        dp[0] = buckets[0];
        dp[1] = buckets[1];
        for (int i = 2; i < dp.length; i++)
            dp[i] = Math.max(buckets[i] + dp[i - 2], dp[i - 1]);
        return dp[dp.length - 1]; 
    }
}
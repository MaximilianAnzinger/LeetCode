class Solution {
    public int missingNumber(int[] nums) {
        int r = 0;
        for(int i = 0; i < nums.length; i++)
            r ^= nums[i] ^ i;
        return r ^ nums.length;
    }
}
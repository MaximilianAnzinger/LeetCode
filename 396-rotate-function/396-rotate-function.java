class Solution {
    public int maxRotateFunction(int[] nums) {
        int r = 0, s = 0, c;
        for(int i = 0; i < nums.length; i++) {
            s += nums[i];
            r += i * nums[i];
        }
        c = r;
        for(int i = nums.length - 1; 0 < i; i--) {
            c += s - nums[i] * nums.length;
            r = Math.max(r, c);
        }
        return r;
    }
}
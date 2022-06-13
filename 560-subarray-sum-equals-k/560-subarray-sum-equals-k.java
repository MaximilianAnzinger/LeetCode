class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] p = new int[nums.length];
        p[0] = nums[0];
        for(int i = 1; i < nums.length; i++)
            p[i] = p[i - 1] + nums[i];
        HashMap<Integer, Integer> m = new HashMap<>();
        int r = 0;
        for(int i = 0; i < nums.length; i++) {
            if(p[i] == k)
                r++;
            r += m.getOrDefault(p[i] - k, 0);
            m.put(p[i], m.getOrDefault(p[i], 0) + 1);
        }
        return r;
    }
}
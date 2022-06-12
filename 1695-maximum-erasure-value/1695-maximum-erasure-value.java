class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int res = 0, i =0, j = 0, curr = 0;
        HashSet<Integer> s = new HashSet<>();
        while(j < nums.length) {
            for(; s.contains(nums[j]); curr -= nums[i++])
                s.remove(nums[i]);
            curr += nums[j];
            s.add(nums[j++]);
            res = (int) Math.max(res, curr);
        }
        return res;
    }
}
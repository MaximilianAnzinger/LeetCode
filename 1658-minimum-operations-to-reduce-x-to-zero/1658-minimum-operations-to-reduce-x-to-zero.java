class Solution {
    public int minOperations(int[] nums, int x) {
        int target = -x;
        for(int i : nums)
            target += i;
        
        if(target < 0)
            return -1;
        
        int i = 0, j = 0, curr = 0, res = -1;
        while(j < nums.length) {
            curr += nums[j++];
            while(curr > target)
                curr -= nums[i++];
            if(curr == target)
                res = (int) Math.max(j-i, res);
        }
        
        return res >= 0 ? nums.length - res : -1;
    }
}
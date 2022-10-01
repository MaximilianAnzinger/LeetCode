class Solution {
    public boolean isMonotonic(int[] nums) {
        int inc = 0;
        for(int i = 0; i < nums.length - 1; i++)
            if(inc == 0) {
                inc = nums[i+1] - nums[i];
            } else if((inc < 0 && nums[i] < nums[i+1]) || (inc > 0 && nums[i] > nums[i+1]))
                return false;
        return true;
    }
}
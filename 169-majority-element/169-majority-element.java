class Solution {
    public int majorityElement(int[] nums) {
        int c = 0, v = 0;
        for(int i : nums) {
            if(c == 0)
                v = i;
            c += v == i ? 1 : -1;
        }
        return v;
    }
}
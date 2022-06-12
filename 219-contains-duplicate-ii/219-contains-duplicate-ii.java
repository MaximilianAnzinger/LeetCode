class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int j = 0; j < nums.length; j++) {
            Integer i = map.put(nums[j], j);
            if(i != null && j - i <= k)
                return true;
        }
        return false;
    }
}
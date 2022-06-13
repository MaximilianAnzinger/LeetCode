class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> c = new HashMap<>();
        for(int i : nums)
            c.put(i, (c.containsKey(i) ? c.get(i) : 0) + 1);
        int r = 0;
        for(Map.Entry<Integer, Integer> e : c.entrySet())
            if(k == 0 && e.getValue() > 1)
                r++;
            else if(k > 0 && c.containsKey(e.getKey() + k))
                r++;
        return r;
    }
}
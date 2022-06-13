class Solution {
    public int maxProduct(String[] words) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for(int i = 0; i < words.length; i++) {
            int mask = 0;
            for(int j = 0; j < words[i].length(); j++)
                mask |= 1 << (words[i].charAt(j) - 'a');
            map.put(mask, map.getOrDefault(mask, 0) < words[i].length() ? words[i].length() : map.getOrDefault(mask, 0));
            
            for(Map.Entry<Integer, Integer> e : map.entrySet())
                if((mask & e.getKey()) == 0)
                    res = res < words[i].length() * e.getValue() ? words[i].length() * e.getValue() : res;
        }
        return res;
    }
}
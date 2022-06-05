class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, LinkedList<String>> h = new HashMap<>();
        for(String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String k = new String(c);
            if(!h.containsKey(k))
                h.put(k, new LinkedList<String>());
            h.get(k).add(s);
        }
        return new LinkedList<>(h.values());
    }
}
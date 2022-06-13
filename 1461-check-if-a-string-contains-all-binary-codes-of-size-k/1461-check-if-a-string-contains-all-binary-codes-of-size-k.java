class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> set = new HashSet<>();
        
        for(int i = 0; i < s.length() - k + 1; i++)
            set.add(s.substring(i, i + k));
        
        return set.size() == 1 << k;
    }
}
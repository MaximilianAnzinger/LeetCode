class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        HashMap<Character, Integer> sub = new HashMap<>();
        int i = 0;
        for(int j = 0; j < s.length(); j++) {
            if(sub.containsKey(s.charAt(j))) {
                if(i < sub.get(s.charAt(j))) {
                    i = sub.get(s.charAt(j));
                }
            }
            if(result < j-i+1) {
                result = j-i+1;
            }
            sub.put(s.charAt(j), j+1);
        }
        return result;
    }
}
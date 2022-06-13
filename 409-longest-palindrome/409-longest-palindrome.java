class Solution {
    public int longestPalindrome(String s) {
        HashMap<Integer, Integer> c = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++)
            c.put((int) s.charAt(i), c.getOrDefault((int) s.charAt(i), 0) + 1);
        
        int length = 0;
        for(int i : c.values())
            if((i & 1) == 0)
                length += i;
            else if((length & 1) == 0)
                length += i;
            else length += i - 1;
        return length;
    }
}
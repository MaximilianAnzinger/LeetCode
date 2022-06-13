class Solution {
    public char findTheDifference(String s, String t) {
        int c = 0, i;
        for(i = 0; i < s.length(); i++)
            c ^= (int) s.charAt(i) ^ (int) t.charAt(i);
        return (char) (c ^ (int) t.charAt(i));
    }
}
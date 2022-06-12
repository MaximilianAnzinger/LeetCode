class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while(i <= j && i < s.length() && 0 <= j) {
            if(!('a' <= s.charAt(i) && s.charAt(i) <= 'z' || 'A' <= s.charAt(i) && s.charAt(i) <= 'Z' || '0' <= s.charAt(i) && s.charAt(i) <= '9')) {
                i++;
                continue;
            }
            if(!('a' <= s.charAt(j) && s.charAt(j) <= 'z' || 'A' <= s.charAt(j) && s.charAt(j) <= 'Z' || '0' <= s.charAt(j) && s.charAt(j) <= '9')) {
                j--;
                continue;
            }
            int l = s.charAt(i), r = s.charAt(j);
            if('A' <= l && l <= 'Z')
                l = 'a' + l - 'A';
            if('A' <= r && r <= 'Z')
                r = 'a' + r - 'A';
            if(l != r)
                return false;
            i++; j--;
            
        }
        return true;
    }
}
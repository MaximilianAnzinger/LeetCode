class Solution {
    public boolean isPalindrome(int x) {
        if(x == 0) {
            return true;
        }
        if(x < 0 || x % 10 == 0) {
            return false;
        }
        int l = x, r = 0;
        while(l > r) {
            r = 10*r + (l%10);
            l /= 10;
        }
        
        return (l == r || l == r/10);
    }
}
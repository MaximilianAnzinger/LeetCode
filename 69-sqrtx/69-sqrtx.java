class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1)
            return x;
        int result = 0, l = 0, r = x, m;
        while(l <= r) {
            m = (l + r) / 2;
            if(m == x / m)
                return m;
            else if(m < x / m) {
                l = m + 1;
                result = m;
            }
            else
                r = m - 1;
        }
        return result;
    }
}
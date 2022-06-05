class Solution {
    public int reverse(int x) {
        boolean sign = x < 0;
        if(sign)
            x = -x;
        int result = 0, t;
        while(x > 0 && result >= 0) {
            t = result * 10 + (x%10);
            if(t/10 != result)
                return 0;
            result = t;
            x /= 10;
        }
        if(result < 0)
            return 0;
        return sign ? - result : result;
    }
}
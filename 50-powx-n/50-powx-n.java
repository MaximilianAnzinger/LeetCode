class Solution {
    public double myPow(double x, int n) {
        double result = 1;
        while(n != 0 && result != 0) {
            if((n & 1) == 1)
                result = n > 0 ? result * x : result / x;
            
            x *= x;
            n /= 2;
        }
        return result;
    }
}